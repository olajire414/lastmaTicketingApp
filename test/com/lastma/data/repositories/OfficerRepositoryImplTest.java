package com.lastma.data.repositories;

import com.lastma.data.models.Officer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


class OfficerRepositoryImplTest {
    Officer officer1;
    OfficerRepositoryImpl officerRepository;

    @BeforeEach
    void startWith(){
        officer1 = new Officer();
        officerRepository = new OfficerRepositoryImpl();
    }

    @Test
    void testThatNoOfOfficerIsZero(){
        assertEquals(0L,officerRepository.count());
    }

    @Test
    void testThat1OfficerIsCreatedAndCountIncrementTo1L(){
        officerRepository.save(officer1);
        assertEquals(1L,officerRepository.count());
    }

    @Test
    void testThat2OfficerIsCreatedAndCountIncrementTo2L(){
        Officer officer2 = new Officer();
        officerRepository.save(officer1);
        officerRepository.save(officer2);
        assertEquals(2L,officerRepository.count());
    }

    @Test
    void testThatICanFindTheFirstOfficerCreatedById(){
        Officer officer2 = new Officer("Yemi","@example");
        officerRepository.save(officer2);
        Officer officerFound = officerRepository.findById(1);
        assertEquals(officerFound,officer2);
    }

    @Test
    void testThatOfficerNameCanBeUpdated(){
        Officer officer2 = new Officer();
        officer2.setFullname("yoyo");
        officerRepository.save(officer2);
        officerRepository.updateName("yoyo","ali");
        assertEquals("ali",officerRepository.findOfficerByName("ali").getFullname());

    }
    @Test
    void testThatOfficerCanBeDeletedById(){
        Officer officer2 = new Officer();
        Officer officer3 = new Officer();
        officerRepository.save(officer2);
        officerRepository.save(officer3);
        assertEquals(2L,officerRepository.count());
        officerRepository.deleteDriverById(1);
        assertEquals(1L,officerRepository.count());



    }


}