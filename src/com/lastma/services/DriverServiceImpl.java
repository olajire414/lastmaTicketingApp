package com.lastma.services;

import com.lastma.data.models.Driver;
import com.lastma.data.repositories.DriverRepositoryImpl;
import com.lastma.dtos.requests.DriverRequest;
import com.lastma.dtos.responses.DriverResponse;
import com.lastma.utils.DriverMapper;

public class DriverServiceImpl implements  DriverService {
    DriverRepositoryImpl driverRepository = new DriverRepositoryImpl();


    @Override
    public DriverResponse register(DriverRequest request) {
        Driver driver = DriverMapper.mapToObject(request);
        Driver saved = driverRepository.save(driver);
    return DriverMapper.mapToResponse(saved);
    }


}

