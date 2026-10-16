package com.lastma.data.repositories;
import com.lastma.data.models.Ticket;

public interface TicketRepository {

    void save(Ticket ticket);

    long count();


}
