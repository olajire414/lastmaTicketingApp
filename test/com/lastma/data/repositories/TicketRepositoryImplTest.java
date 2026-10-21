package com.lastma.data.repositories;

import com.lastma.data.models.Ticket;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TicketRepositoryImplTest {
    TicketServices ticketRepository;
    private Ticket ticket;

    @BeforeEach
    void startWith(){
        ticketRepository = new TicketRepositoryImpl();
        ticket = new Ticket();
        ticketRepository.deleteAll();

    }
    @Test
    void testThatATicketCanBeSaved(){
        ticketRepository.save(ticket);
        assertEquals(1L, ticketRepository.count());
    }

    @Test
    void testThatISaveTwoTicket_CountIsTwo(){
        Ticket ticket2 = new Ticket();
        ticketRepository.save(ticket2);
        ticketRepository.save(ticket);
        assertEquals(2L, ticketRepository.count());
    }

    @Test
    void testThatISavedTwoTicketsAndFindReturnsFirstTicket(){
        Ticket ticket2 = new Ticket
();
        ticket2.setId(0);
        ticketRepository.save(ticket2);
        assertEquals(0, ticketRepository.findById(0).getId());
    }
    @Test
    void testThatTicketIdCanBeDeleted(){
        ticketRepository.save(ticket);
        assertEquals(1L, ticketRepository.count());
        ticket.setId(1);
        assertEquals(1,ticket.getId());
        ticketRepository.deleteTicketById(1);

    }
    @Test
    void testThatTicketIdCanBeUpdated(){
        ticketRepository.save(ticket);
        assertEquals(1L, ticketRepository.count());
        ticket.setId(1);
        assertEquals(1,ticket.getId());
        ticket.setId(2);
        assertEquals(2,ticket.getId());

    }


}