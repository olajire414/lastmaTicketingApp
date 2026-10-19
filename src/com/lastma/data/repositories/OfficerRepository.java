package com.lastma.data.repositories;

import com.lastma.data.models.Officer;

public interface OfficerRepository {

    void save(Officer officer);

    long count();

    Officer findById(int id);


    void deleteDriverById(int id);

    Officer findOfficerByName(String name);

    void updateName(String oldName, String newName);

    Officer[] findAll();
}
