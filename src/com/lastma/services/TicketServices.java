package com.lastma.services;

import com.lastma.dtos.requests.TicketRequest;
import com.lastma.dtos.responses.TicketResponse;

public interface TicketServices {

    TicketResponse issueTicket(TicketRequest request);
}
