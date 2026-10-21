package com.lastma.data.repositories;

import com.lastma.data.models.Officer;

import java.util.ArrayList;
import java.util.List;

public class OfficerRepositoryImpl implements OfficerRepository{
    private static List<Officer> officers = new ArrayList<>();


    @Override
    public Officer save(Officer officer) {
        officers.add(officer);
        return officer;
    }

    @Override
    public long count() {

        return officers.size();
    }

    @Override
    public Officer findById(int id) {
        for (Officer officer : officers) {
            if (officer.getId() == id) {
                return officer;
            }
        }
        return null;
    }

    @Override
    public void deleteOfficerById(int id) {
        for (Officer officer : officers) {
            if (officer.getId() == id) {
                officer.setId(0);
            }
        }

    }

    @Override
    public Officer findOfficerByName(String fullname) {
        for (Officer officer : officers) {
            if (officer.getFullname().equals(fullname)){
                return officer;
            }
        }
        return null;
    }

    @Override
    public void deleteAll() {
        officers.clear();
    }


}
