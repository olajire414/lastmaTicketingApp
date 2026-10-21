package com.lastma.services;


import com.lastma.data.repositories. VehicleRepositoryImpl;
import com.lastma.dtos.requests.VehicleRequest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehicleServiceImplTest {
     VehicleRepositoryImpl  vehicleRepository;
     VehicleServiceImpl vehicleService;

    @BeforeEach
    void startWith(){
         vehicleRepository = new  VehicleRepositoryImpl();
         vehicleService = new  VehicleServiceImpl();
         vehicleRepository.deleteAll();
    }

    @Test
    void testThatVehicleCanBeRegistered() {
        assertEquals(0L,  vehicleRepository.count());
         VehicleRequest request = new  VehicleRequest();
         vehicleService.register(request);
        assertEquals(1L,  vehicleRepository.count());
    }

    @Test
    void testThat2VehiclesCreatedCountIncreasedTo2(){
         VehicleRequest request1 = new  VehicleRequest();
         vehicleService.register(request1);
         VehicleRequest request2 = new  VehicleRequest();
         vehicleService.register(request2);
        assertEquals(2L,  vehicleRepository.count());
    }

    @Test
    void testThatVehicleIdRegisteredIsSame(){
         VehicleRequest request = new  VehicleRequest();
        request.setId(1);
        int id = vehicleService.register(request).getId();
        assertEquals(1,id);
    }

}