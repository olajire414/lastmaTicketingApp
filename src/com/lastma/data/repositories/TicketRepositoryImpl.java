package com.lastma.data.repositories;

import com.lastma.data.models.Ticket;

import java.util.ArrayList;
import java.util.List;

public class TicketRepositoryImpl implements TicketServices {
    private static List<Ticket> tickets = new ArrayList<>();

    @Override
    public Ticket save(Ticket ticket) {
        tickets.add(ticket);

        return ticket;
    }

    @Override
    public long count() {
        return tickets.size();
    }

    @Override
    public Ticket findById(int id) {
        for (Ticket ticket : tickets) {
            if (ticket.getId() == id) {
                return ticket;
            }
        }
        return null;
    }

    @Override
    public void deleteTicketById(int id) {

        for (Ticket ticket : tickets) {
            if (ticket.getId() == id) {
                ticket.setId(0);
            }
        }
    }


    @Override
    public void deleteAll() {
        tickets.clear();
    }
}