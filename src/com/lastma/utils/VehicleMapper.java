package com.lastma.utils;

import com.lastma.data.models.Vehicle;
import com.lastma.dtos.requests.VehicleRequest;
import com.lastma.dtos.responses.VehicleResponse;

public class VehicleMapper {

    public static Vehicle mapToObject(VehicleRequest request){
        Vehicle vehicle = new Vehicle();
        vehicle.setId(request.getId());
        vehicle.setColour(request.getColour());
        vehicle.setMake(request.getMake());
        vehicle.setModel(request.getModel());
        vehicle.setMotorist(request.getMotorist());

        return vehicle;
    }

    public static VehicleResponse mapToResponse(Vehicle vehicle){
        VehicleResponse response = new VehicleResponse();
        response.setId(vehicle.getId());
        response.setMotorist(vehicle.getMotorist());
        return response;
    }
    
    
}
