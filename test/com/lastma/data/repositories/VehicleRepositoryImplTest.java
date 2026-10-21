package com.lastma.data.repositories;

import com.lastma.data.models. Vehicle;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehicleRepositoryImplTest {

    VehicleRepositoryImpl vehicleRepository;
    private Vehicle vehicle;
    @BeforeEach
    void startWith(){
        vehicleRepository = new VehicleRepositoryImpl();
        vehicle = new Vehicle();
        vehicleRepository.deleteAll();


    }
    @Test
    void testThatAVehicleCanBeSaved(){
        vehicleRepository.save(vehicle);
        assertEquals(1L, vehicleRepository.count());
    }

    @Test
    void testThatISaveTwoVehicles_CountIsTwo(){
         Vehicle driver2 = new Vehicle();
        vehicleRepository.save(driver2);
        vehicleRepository.save(vehicle);
        assertEquals(2L, vehicleRepository.count());
    }

    @Test
    void testThatISavedTwoVehiclesAndFindReturnsFirstVehicle(){
         Vehicle driver2 = new Vehicle();
        driver2.setId(0);
        vehicleRepository.save(driver2);
        assertEquals(0, vehicleRepository.findById(0).getId());
    }
    @Test
    void testThatVehicleIdCanBeDeleted(){
        vehicleRepository.save(vehicle);
        assertEquals(1L, vehicleRepository.count());
        vehicle.setId(1);
        assertEquals(1,vehicle.getId());
        vehicleRepository.deleteVehicleById(1);

    }
    @Test
    void testThatVehicleIdCanBeUpdated(){
        vehicleRepository.save(vehicle);
        assertEquals(1L, vehicleRepository.count());
        vehicle.setId(1);
        assertEquals(1,vehicle.getId());
        vehicle.setId(2);
        assertEquals(2,vehicle.getId());

    }
    @Test
    void testThatVehicleCanBeFoundByName(){
        vehicle = new Vehicle();
        vehicle.setMake("toyota");
        vehicleRepository.save(vehicle);
         Vehicle vehicleFound = vehicleRepository.findVehicleByMake("toyota");
        assertSame(vehicle, vehicleFound);

    }
    
    

}