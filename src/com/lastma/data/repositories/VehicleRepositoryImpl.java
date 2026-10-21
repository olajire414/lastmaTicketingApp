package com.lastma.data.repositories;

import com.lastma.data.models.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class VehicleRepositoryImpl implements VehicleRepository{
    public static List<Vehicle> vehicles = new ArrayList<>();


    @Override
    public Vehicle save(Vehicle vehicle) {
        vehicles.add(vehicle);
        return vehicle;
    }

    @Override
    public long count() {
        return vehicles.size();
    }

    @Override
    public Vehicle findById(int id) {
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getId() == id) {
                return vehicle;
            }

        }
        return null;

    }

    @Override
    public void deleteVehicleById(int id) {
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getId() == id) {
                vehicle.setId(0);
            }
        }

    }

    @Override
    public Vehicle findVehicleByMake(String make) {
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getMake().equals(make)){
                return vehicle;
            }
        }
        return null;
    }

    @Override
    public void deleteAll() {
        vehicles.clear();
    }


}

