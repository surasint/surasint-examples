package com.surasint.example.db;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Spy;
import org.mockito.runners.MockitoJUnitRunner;
import org.skife.jdbi.v2.DBI;
import org.skife.jdbi.v2.Handle;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import static org.mockito.Mockito.doReturn;

@RunWith(MockitoJUnitRunner.class)
public class UserDaoInMemTest {

    private static Handle handle;

    @InjectMocks
    @Spy
    private UserDao target;

    @Before
    public void before() throws ClassNotFoundException, IOException {
        //setup in memory database
        Class.forName("org.h2.Driver");
        DBI dbi = new DBI("jdbc:h2:mem:test;mode=MySQL");
        handle = dbi.open();
        handle.execute("set mode MySQL;");

        //run sql scrip to create our table
        String sql = new String(Files.readAllBytes(Paths.get("./dbscript.sql")));
        handle.createScript(sql).executeAsSeparateStatements();

        //mock (as spy) to return handle ( it is like a DB connection, but for the JDBI framework)
        doReturn(handle).when(target).getHandle();

        //insert some data
        handle.execute("INSERT INTO users (id,username) VALUES (1,'username1');");
        handle.execute("INSERT INTO users (id,username) VALUES (2,'username2');");

    }



    @After
    public void after() {
        //clean data
        handle.execute("DROP ALL OBJECTS;");
    }

    @Test
    public void test_list_ok() {
        //given

        //when
        List<UserBean> userBeanList = target.list();

        //then
        Assert.assertEquals(userBeanList.size(), 2);
    }

    @Test
    public void test_insert_ok() {
        //given

        //when
        List<UserBean> beforeList = target.list();
        UserBean userBean = new UserBean();
        userBean.setUsername("abc");
        target.insert(userBean);
        List<UserBean> afterList = target.list();

        //then
        Assert.assertEquals(beforeList.size(), 2);
        Assert.assertEquals(afterList.size(), 3);
    }
}