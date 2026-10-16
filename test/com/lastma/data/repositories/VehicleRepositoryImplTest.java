package com.lastma.data.repositories;

import com.lastma.data.models.Officer;
import com.lastma.data.models.Vehicle;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehicleRepositoryImplTest {
    Vehicle truck;
    VehicleRepositoryImpl vehicleRepository;

    @BeforeEach
    void startWith() {
        truck = new Vehicle();
        vehicleRepository = new VehicleRepositoryImpl();
    }

    @Test
    void testThatRepositoryIsEmpty() {
        assertEquals(0L, vehicleRepository.count());
    }

    @Test
    void testThat1OfficerIsCreatedAndCountIncrementTo1L() {
        vehicleRepository.save(truck);
        assertEquals(1L, vehicleRepository.count());
    }

    @Test
    void testThatICanFindTheFirstVehicleByBrandName() {
        Vehicle car1 = new Vehicle();
        Vehicle car2 = new Vehicle();

        car1.setCarBrand("toyota");
        car2.setCarBrand("toyota");

        vehicleRepository.save(car1);
        vehicleRepository.save(car2);
        assertEquals(2L, vehicleRepository.count());
        Vehicle carFound = vehicleRepository.findVehicleByCarBrand("toyota");
        assertEquals(car1, carFound);
    }

    @Test
    void testThatVehicleBrandNameCanBeUpdated() {
        Vehicle car1 = new Vehicle();
        car1.setCarBrand("toyota");
        vehicleRepository.save(car1);
        vehicleRepository.updateName("toyota", "honda");
        assertEquals("honda", vehicleRepository.findVehicleByCarBrand("honda").getCarBrand());

    }

    @Test
    void testThatVehicleCanBeDeletedByBrandName() {
        Vehicle car1 = new Vehicle();
        car1.setCarBrand("toyota");
        Vehicle car2 = new Vehicle();
        car2.setCarBrand("peugeot");
        vehicleRepository.save(car1);
        vehicleRepository.save(car2);
        assertEquals(2L, vehicleRepository.count());
        vehicleRepository.deleteVehicleByBrandName("peugeot");
        assertEquals(1L, vehicleRepository.count());


    }
}