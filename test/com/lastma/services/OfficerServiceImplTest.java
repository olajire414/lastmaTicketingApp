package com.lastma.services;


import com.lastma.data.repositories.OfficerRepository;
import com.lastma.data.repositories.OfficerRepositoryImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class OfficerServiceImplTest {

 private OfficerServiceImpl officerService;
 private OfficerRepository officerRepository = new OfficerRepositoryImpl();

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




}