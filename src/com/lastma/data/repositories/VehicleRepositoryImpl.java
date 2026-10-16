package com.lastma.data.repositories;

import com.lastma.data.models.Officer;
import com.lastma.data.models.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class VehicleRepositoryImpl implements VehicleRepository{
    private List <Vehicle> vehicles = new ArrayList<>();
    private int size = 0;


    @Override
    public void save(Vehicle vehicle) {

        vehicles.add(vehicle);
        size++;

    }

    @Override
    public long count() {
        return size;
    }

    @Override
    public Vehicle findByPlateNumber(int id) {
        return null;
    }

    @Override
    public void deleteVehicleByBrandName(String brandName) {
        for(Vehicle vehicle : vehicles){
            if(vehicle.getCarBrand().equals(brandName)){
                vehicle.setCarBrand(null);
            }
        }
        size--;

    }


    @Override
    public Vehicle findVehicleByCarBrand(String name) {
        for(Vehicle vehicle : vehicles){
            if(vehicle.getCarBrand().equals(name)){
                return vehicle;
            }
        }
        return null;
    }

    @Override
    public void updateName(String oldBrad, String newBrand) {
        for(Vehicle vehicle : vehicles){
            if(vehicle.getCarBrand().equals(oldBrad)){
                vehicle.setCarBrand(newBrand);
                break;

            }
        }

    }

}