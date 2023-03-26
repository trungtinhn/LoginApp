package com.example.loginapp;

import kotlin.text.UStringsKt;

public class Acount {
    protected String username;
    protected String password;
    public Acount()
    {
        super();
    }
    public String getUserName()
    {
        return this.username.toString();
    }

    public String getPassword()
    {
        return this.password.toString();
    }
}
