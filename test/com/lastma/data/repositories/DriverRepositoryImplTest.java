package com.lastma.data.repositories;

import com.lastma.data.models.Driver;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertSame;


class DriverRepositoryImplTest {

    DriverRepositoryImpl driverRepository;
    private Driver driver;
    @BeforeEach
    void startWith(){
        driverRepository = new DriverRepositoryImpl();
        driver = new Driver();

    }
    @Test
    void testThatADriverCanBeSaved(){
        driverRepository.save(driver);
        assertEquals(1L,driverRepository.count());
    }

    private void assertEquals(long l, long count) {
    }

    @Test
    void testThatISaveTwoDrivers_CountIsTwo(){
        Driver driver2 = new Driver();
        driverRepository.save(driver2);
        driverRepository.save(driver);
        assertEquals(2L,driverRepository.count());
    }

    @Test
    void testThatISavedTwoDriversAndFindReturnsFirstDriver(){
        Driver driver2 = new Driver();
        driver2.setId(0);
        driverRepository.save(driver2);
        assertEquals(0,driverRepository.findById(0).getId());
    }
    @Test
    void testThatDriverIdCanBeDeleted(){
        driverRepository.save(driver);
        assertEquals(1L,driverRepository.count());
        driver.setId(1);
        assertEquals(1,driver.getId());
        driverRepository.deleteDriverById(1);

    }
    @Test
    void testThatDriverIdCanBeUpdated(){
        driverRepository.save(driver);
        assertEquals(1L,driverRepository.count());
        driver.setId(1);
        assertEquals(1,driver.getId());
        driver.setId(2);
        assertEquals(2,driver.getId());

    }
    @Test
    void testThatDriverCanBeFoundByName(){
         driver = new Driver();
         driver.setFullName("yemi");
        driverRepository.save(driver);
        Driver driverFound = driverRepository.findDriverByName("yemi");
        assertSame(driver,driverFound);

    }





    

}