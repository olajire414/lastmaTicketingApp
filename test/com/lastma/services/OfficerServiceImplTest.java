package com.lastma.services;

import com.lastma.data.models.Driver;
import com.lastma.data.models.OffenceType;
import com.lastma.data.repositories.DriverRepositoryImpl;
import com.lastma.data.repositories.OfficerRepository;
import com.lastma.data.repositories.OfficerRepositoryImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class OfficerServiceImplTest {

 private OfficerServiceImpl officerService;
 private OfficerRepository officerRepository = new OfficerRepositoryImpl();
 private DriverRepositoryImpl driverRepository = new DriverRepositoryImpl();

 @BeforeEach
    void startWith(){
     officerService = new OfficerServiceImpl();
 }


 @Test
    void registerOfficer_IncrementCountToOne(){
     assertEquals(0L,officerRepository.count());
     officerService.register("fullname","email","password");
     assertEquals(1L,officerRepository.count());

 }
 @Test
 void testThatThatRegister2Officers_CountIsTwo(){
   officerService.register("fullname", "email", "password");
   officerService.register("fullname", "email", "password");
   assertEquals(2L, officerRepository.count());
  }
 @Test
  void testThatOfficerCan_IssueTicket() {
  officerService.register("Olu", "olu@gmail.com", "2345");
  Driver driver = new Driver();
  driver.setCarPlateNumber("la23sur");
  driver.setFullName("john");
  driver.setEmail("john@gmail.com");
  officerService.issueTicket(1, OffenceType.ONE_WAY,driver);
  assertEquals(1L, driverRepository.count());
 }


}









