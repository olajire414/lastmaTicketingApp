package com.lastma.data.repositories;

import com.lastma.data.models.Driver;

public interface DriverRepository {
    void save(Driver driver);

    long count();

    Driver findById(int id);

    void deleteDriverById(int id);

    Driver findDriverByName(String name);



}
