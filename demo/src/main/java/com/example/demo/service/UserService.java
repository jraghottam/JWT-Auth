package com.example.demo.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.example.demo.models.users;
@Service
public class UserService {
    List<users> store = new ArrayList<>();

    public UserService() {
        store.add(new users(UUID.randomUUID().toString(),"testname","testname@gmail"));
        store.add(new users(UUID.randomUUID().toString(),"testname1","testname1@gmail"));
        store.add(new users(UUID.randomUUID().toString(),"testname2","testname2@gmail"));
    }

    public List<users> getusersList() {
        return store;
    }
}
