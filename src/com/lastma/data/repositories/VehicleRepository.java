package com.lastma.data.repositories;

import com.lastma.data.models.Vehicle;
import com.lastma.dtos.requests.VehicleRequest;
import com.lastma.dtos.responses.VehicleResponse;


public interface VehicleRepository {

    Vehicle save(Vehicle vehicle);

    long count();

    Vehicle findById(int id);

    void deleteVehicleById(int id);

    Vehicle findVehicleByMake(String make);
    void deleteAll();


}
