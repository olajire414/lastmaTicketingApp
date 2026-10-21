package com.lastma.controllers;

import com.lastma.dtos.requests.VehicleRequest;
import com.lastma.dtos.responses.ApiResponse;
import com.lastma.services.VehicleServiceImpl;
import com.lastma.services.VehicleServices;

public class VehicleController {
    private VehicleServices vehicleServices  = new VehicleServiceImpl();

    public ApiResponse registerVehicle(VehicleRequest request){
        try{
            return new ApiResponse(true,vehicleServices.register(request));
        }catch (Exception e){
            return new ApiResponse(false,e.getMessage());
        }
    }
}
