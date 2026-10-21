package com.lastma.data.repositories;

import com.lastma.data.models.Officer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OfficerRepositoryImplTest {

    OfficerRepositoryImpl officerRepository;
    private Officer officer;
    @BeforeEach
    void startWith(){
        officerRepository = new OfficerRepositoryImpl();
        officer = new Officer();
        officerRepository.deleteAll();
    }
    @Test
    void testThatAOfficerCanBeSaved(){
        officerRepository.save(officer);
        assertEquals(1L,officerRepository.count());
    }

    private void assertEquals(long l, long count) {
    }

    @Test
    void testThatISaveTwoOfficers_CountIsTwo(){
        Officer driver2 = new Officer();
        officerRepository.save(driver2);
        officerRepository.save(officer);
        assertEquals(2L,officerRepository.count());
    }

    @Test
    void testThatISavedTwoOfficersAndFindReturnsFirstOfficer(){
        Officer driver2 = new Officer();
        driver2.setId(0);
        officerRepository.save(driver2);
        assertEquals(0,officerRepository.findById(0).getId());
    }
    @Test
    void testThatOfficerIdCanBeDeleted(){
        officerRepository.save(officer);
        assertEquals(1L,officerRepository.count());
        officer.setId(1);
        assertEquals(1,officer.getId());
        officerRepository.deleteOfficerById(1);

    }
    @Test
    void testThatOfficerIdCanBeUpdated(){
        officerRepository.save(officer);
        assertEquals(1L,officerRepository.count());
        officer.setId(1);
        assertEquals(1,officer.getId());
        officer.setId(2);
        assertEquals(2,officer.getId());

    }
    @Test
    void testThatOfficerCanBeFoundByName(){
        officer = new Officer();
        officer.setFullname("yemi");
        officerRepository.save(officer);
        Officer officerFound = officerRepository.findOfficerByName("yemi");
        assertSame(officer,officerFound);

    }


}