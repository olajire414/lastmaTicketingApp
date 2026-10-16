package com.lastma.data.repositories;

import com.lastma.data.models.Ticket;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TicketRepositoryImplTest {
    Ticket ticket;
    TicketRepositoryImpl ticketRepository;
    @BeforeEach
void startWith(){
        ticket = new Ticket();
        ticketRepository = new TicketRepositoryImpl();
    }
    @Test
   void testThatTheTheRepositoryIsEmpty(){
        assertEquals(0L,ticketRepository.count());

    }
}
