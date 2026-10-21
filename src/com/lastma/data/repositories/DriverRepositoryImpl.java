package com.lastma.data.repositories;

import com.lastma.data.models.Driver;

import java.util.ArrayList;
import java.util.List;

public class DriverRepositoryImpl implements DriverRepository{

    private static List<Driver> drivers = new ArrayList<>();


    @Override
    public Driver save(Driver driver) {
        drivers.add(driver);
return driver;
    }

    @Override
    public long count() {

        return drivers.size();
    }

    @Override
    public Driver findById(int id) {
        for (Driver driver : drivers) {
            if (driver.getId() == id) {
                return driver;
            }
        }
        return null;
    }

    @Override
    public void deleteDriverById(int id) {
        for (Driver driver : drivers) {
            if (driver.getId() == id) {
                driver.setId(0);
            }
        }

    }

    @Override
    public Driver findDriverByName(String fullname) {
        for (Driver driver : drivers) {
            if (driver.getFullname().equals(fullname)){
                return driver;
            }
        }
        return null;
    }


    }



