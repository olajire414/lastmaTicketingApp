package com.lastma.services;

import com.lastma.data.models.Driver;
import com.lastma.data.models.OffenceType;

public interface OfficerService {


    void register(String fullname, String email, String password);


    void validateDuplicateEmail(String email);

    void issueTicket(int i, OffenceType offenceType, Driver driver);
}
