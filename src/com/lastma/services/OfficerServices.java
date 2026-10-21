package com.lastma.services;

import com.lastma.data.models.Driver;
import com.lastma.dtos.requests.OfficerRequest;
import com.lastma.dtos.responses.OfficerResponse;


public interface OfficerServices {


    OfficerResponse register(OfficerRequest request);


    void issueTicket(String id, Driver name);
}
