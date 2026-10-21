package com.lastma.services;

import com.lastma.data.models.Vehicle;
import com.lastma.data.repositories.VehicleRepository;
import com.lastma.data.repositories.VehicleRepositoryImpl;
import com.lastma.dtos.requests.VehicleRequest;
import com.lastma.dtos.responses.VehicleResponse;
import com.lastma.utils.VehicleMapper;

public class VehicleServiceImpl implements VehicleServices{
     VehicleRepository vehicleRepository = new VehicleRepositoryImpl();


    @Override
    public VehicleResponse register(VehicleRequest request) {
        Vehicle vehicle = VehicleMapper.mapToObject(request);
        Vehicle saved = vehicleRepository.save(vehicle);
        return VehicleMapper.mapToResponse(saved);

    }
}

