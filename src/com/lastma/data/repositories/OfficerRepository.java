package com.lastma.data.repositories;

import com.lastma.data.models.Driver;
import com.lastma.data.models.Officer;

public interface OfficerRepository {

    Officer save(Officer driver);

    long count();

    Officer findById(int id);

    void deleteOfficerById(int id);

    Officer findOfficerByName(String name);

    void deleteAll();
}
