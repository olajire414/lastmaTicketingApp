package com.lastma.services;

import com.lastma.data.models.Officer;
import com.lastma.data.repositories.OfficerRepository;
import com.lastma.data.repositories.OfficerRepositoryImpl;

public class OfficerServiceImpl implements OfficerService {

    OfficerRepositoryImpl repository = new OfficerRepositoryImpl();

    @Override
    public void register(String fullname, String email, String password) {
        Officer officer = new Officer();
        officer.setFullname(fullname);
        officer.setEmail(email);
        officer.setPassword(password);
        repository.save(officer);


    }
}
