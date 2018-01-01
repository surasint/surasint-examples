package com.surasint.example.db.util;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ResultSetHelper {
    public static <T> T get(ResultSet resultSet, String columnName) throws SQLException {
        Object obj = resultSet.getObject(columnName);
        if (obj == null){
            return null;
        }else{
            return (T)obj;
        }
    }
}
