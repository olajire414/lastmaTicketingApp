package com.lastma.data.models;

import java.util.Locale;

public class Officer{
    private int id;
    private String fullname;
    private String email;


    public Officer(){}

    public Officer(String fullname,String email){
        this.fullname = fullname.toLowerCase();
        this.email = email.toLowerCase();

    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullName) {
        this.fullname = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



}
