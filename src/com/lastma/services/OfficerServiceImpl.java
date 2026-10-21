package com.lastma.services;


import com.lastma.data.models.Driver;
import com.lastma.data.models.Officer;
import com.lastma.data.repositories.OfficerRepository;
import com.lastma.data.repositories.OfficerRepositoryImpl;
import com.lastma.dtos.requests.OfficerRequest;
import com.lastma.dtos.responses.OfficerResponse;
import com.lastma.utils.OfficerMapper;

public class OfficerServiceImpl implements OfficerServices {
    OfficerRepository officerRepository = new OfficerRepositoryImpl();

    @Override
    public OfficerResponse register(OfficerRequest request) {
        Officer officer = OfficerMapper.mapToObject(request);
        Officer saved = officerRepository.save(officer);
        return OfficerMapper.mapToResponse(saved);
    }


    @Override
    public void issueTicket(String id, Driver name) {

    }
}





