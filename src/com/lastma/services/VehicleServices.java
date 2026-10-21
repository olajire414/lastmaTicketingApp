package com.lastma.services;


import com.lastma.dtos.requests.VehicleRequest;
import com.lastma.dtos.responses.VehicleResponse;

public interface VehicleServices {


    VehicleResponse register(VehicleRequest request);
}
