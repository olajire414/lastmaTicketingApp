package com.lastma.data.models;

import java.util.Collection;

public class Driver {
    private int id;
    private String fullName;
    private String email;
    private String plateNumber;
    String ticket;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullname() {
        return fullName;
    }

    public void setFullName(String fullname) {
        this.fullName = fullname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public void setCarPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public String getTicket() {
        return ticket;
    }
}
