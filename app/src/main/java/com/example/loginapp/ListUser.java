package com.example.loginapp;

import java.lang.reflect.Array;

public class ListUser {
    protected Acount[] listUser;
    public ListUser()
    {
        listUser = new Acount[2];
        listUser[0] = new Acount();
        listUser[0].username = "user";
        listUser[0].password = "12345";
        listUser[1] = new Acount();
        listUser[1].username = "ABC";
        listUser[1].password = "123456";
    }
}
