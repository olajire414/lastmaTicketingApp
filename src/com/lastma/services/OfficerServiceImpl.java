package com.lastma.services;

import com.lastma.data.models.Driver;
import com.lastma.data.models.OffenceType;
import com.lastma.data.models.Officer;
import com.lastma.data.repositories.OfficerRepository;
import com.lastma.data.repositories.OfficerRepositoryImpl;

public class OfficerServiceImpl implements OfficerService {
    OfficerRepositoryImpl repository = new OfficerRepositoryImpl();



    @Override
    public void register(String fullname, String email, String password) {
        validateDuplicateEmail(email);
        Officer officer = new Officer();
        officer.setFullname(fullname);
        officer.setEmail(email);
        officer.setPassword(password);
        repository.save(officer);
    }

    @Override
    public void validateDuplicateEmail(String email) {

        for (Officer officer : repository.findAll()) {
            if (officer.getEmail().equals(email)) {
                throw new IllegalArgumentException("officer already exist");
            }
        }
    }

    @Override
    public void issueTicket(int id, OffenceType offenceType, Driver driver) {

    }

}
