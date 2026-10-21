package com.lastma.services;

import com.lastma.data.repositories.OfficerRepositoryImpl;
import com.lastma.dtos.requests.OfficerRequest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OfficerServiceImplTest {

    OfficerRepositoryImpl officerRepository ;
    OfficerServices officerServices;

    @BeforeEach
    void startWith(){
        officerRepository = new OfficerRepositoryImpl();
        officerServices = new OfficerServiceImpl();

    }
    @Test
    void testThatDriverCanBeRegistered() {
        assertEquals(0L, officerRepository.count());
        OfficerRequest request = new OfficerRequest();
        officerServices.register(request);
        assertEquals(1L, officerRepository.count());
    }
    @Test
    void testThat2DriversCreatedCountIncreasedTo2(){
        OfficerRequest request1 = new OfficerRequest();
        officerServices.register(request1);
        OfficerRequest request2 = new OfficerRequest();
        officerServices.register(request2);
        assertEquals(2L, officerRepository.count());
    }

    @Test
    void testThatDriverIdRegisteredIsSame(){
        OfficerRequest request = new OfficerRequest();
        request.setId(1);
        int id =  officerServices.register(request).getId();
        assertEquals(1,id);
        request.setFullname("musa");



    }
    


}