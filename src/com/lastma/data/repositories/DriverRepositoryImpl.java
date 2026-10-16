package com.lastma.data.repositories;

import com.lastma.data.models.Driver;

import java.util.ArrayList;
import java.util.List;

public class DriverRepositoryImpl implements DriverRepository{

    private List<Driver> drivers = new ArrayList<>();
    private int count = 0;


    @Override
    public void save(Driver driver) {
        count++;
        driver.setId(count);
        drivers.add(driver);

    }

    @Override
    public long count() {

        return count;
    }

    @Override
    public Driver findById(int id) {
        for (Driver driver : drivers) {
            if (driver.getId() == (id)) {
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
        count--;
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
