package com.lastma.services;

import com.lastma.data.repositories.DriverRepositoryImpl;
import com.lastma.dtos.requests.DriverRequest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DriverServiceImplTest {
    DriverRepositoryImpl driverRepository ;
    DriverService driverService;

    @BeforeEach
    void startWith(){
        driverRepository = new DriverRepositoryImpl();
        driverService = new DriverServiceImpl();

    }
@Test
    void testThatDriverCanBeRegistered() {
    assertEquals(0L, driverRepository.count());
    DriverRequest request = new DriverRequest();
    driverService.register(request);
    assertEquals(1L, driverRepository.count());
}
    @Test
    void testThat2DriversCreatedCountIncreasedTo2(){
        DriverRequest request1 = new DriverRequest();
        driverService.register(request1);
        DriverRequest request2 = new DriverRequest();
        driverService.register(request2);
        assertEquals(2L, driverRepository.count());
}

@Test
    void testThatDriverIdRegisteredIsSame(){
    DriverRequest request = new DriverRequest();
    request.setId(1);
    int id =  driverService.register(request).getId();
    assertEquals(1,id);
    request.setFullname("musa");



}
    }



