package com.lastma.data.repositories;

import com.lastma.data.models.Vehicle;

public interface VehicleRepository {
    void save(Vehicle vehicle);

    long count();

    Vehicle findByPlateNumber(int id);


    void deleteVehicleByBrandName(String brandName);

    Vehicle findVehicleByCarBrand(String name);


    void updateName(String oldBrad, String newBrand);
}
