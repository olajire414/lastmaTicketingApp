package com.lastma.utils;

import com.lastma.data.models.Ticket;
import com.lastma.dtos.requests.TicketRequest;
import com.lastma.dtos.responses.TicketResponse;

public class TicketMapper {

    public static Ticket mapToObject(TicketRequest request) {
        Ticket ticket = new Ticket();
        ticket.setId(request.getId());
        ticket.setTicketNumber(request.getTicketNumber());
        ticket.setAssessedFine(request.getAssessedFine());
        ticket.setIssuedAt(request.getIssuedAt());
        ticket.setOfficerId(request.getOfficerId());
        ticket.setDescription(request.getDescription());
        ticket.setVehicleId(request.getVehicleId());
        ticket.setOffenceId(request.getOffenceId());
        ticket.setStatus(request.getStatus());
        ticket.setIncidentDateTime(request.getIncidentDateTime());

        return ticket;
    }

    public static TicketResponse mapToResponse(Ticket ticket){
        TicketResponse response = new TicketResponse();
        response.setId(ticket.getId());
        response.setAssessedFine(ticket.getAssessedFine());
        response.setDescription(ticket.getDescription());
        response.setLocation(ticket.getLocation());
        response.setOffenceId(ticket.getOffenceId());
        response.setIncidentDateTime(ticket.getIncidentDateTime());

        return response;
    }
}
