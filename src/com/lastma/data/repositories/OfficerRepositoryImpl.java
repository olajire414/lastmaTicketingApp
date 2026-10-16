package com.lastma.data.repositories;

import com.lastma.data.models.Officer;

import java.util.ArrayList;
import java.util.List;

public class OfficerRepositoryImpl implements OfficerRepository{

    private List<Officer> officers = new ArrayList<>();
    private int size;


    @Override
    public void save(Officer officer) {
        size++;
        officer.setId(size);
        officers.add(officer);

    }

    @Override
    public long count() {

        return size;
    }

    @Override
    public Officer findById(int id) {
        for (Officer officer : officers){
            if(officer.getId() == id)
            { return officer; };
        }
        return null;

    }

    @Override
    public void deleteDriverById(int id) {
        for(Officer officer : officers){
            if(officer.getId() == id){
                officer.setId(0);
            }
        }
        size--;

    }

    @Override
    public Officer findOfficerByName(String name) {
        for(Officer officer : officers){
            if(officer.getFullname().equals(name)){ return officer;}
        }
        return null;
    }



    @Override
    public void updateName(String oldName, String newName) {
        for(Officer officer : officers){
            if(officer.getFullname().equals(oldName)){
                officer.setFullname(newName);
                break;

            }
        }


    }



}
