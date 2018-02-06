package com.surasint.example.service;

import org.springframework.stereotype.Service;

@Service
public class CountService {
    private static int i;

    public int count(){
        return i++;
    }
}
