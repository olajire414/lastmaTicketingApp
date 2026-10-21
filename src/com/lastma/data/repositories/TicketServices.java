package com.lastma.data.repositories;

import com.lastma.data.models.Ticket;

public interface TicketServices {

    Ticket save(Ticket ticket);

    long count();

    Ticket findById(int id);

    void deleteTicketById(int id);

    void deleteAll();



}
