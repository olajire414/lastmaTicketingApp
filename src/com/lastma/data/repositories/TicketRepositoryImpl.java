package com.lastma.data.repositories;

import com.lastma.data.models.Ticket;

import java.util.ArrayList;
import java.util.List;

public class TicketRepositoryImpl implements TicketRepository {
    private List <Ticket> tickets = new ArrayList<>();

    @Override
    public void save(Ticket ticket) {

    }

    @Override
    public long count() {
        return 0L;
    }




    }

