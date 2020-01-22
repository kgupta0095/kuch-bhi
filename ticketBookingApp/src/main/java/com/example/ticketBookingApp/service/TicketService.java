package com.example.ticketBookingApp.service;

import com.example.ticketBookingApp.entity.Ticket;

import java.util.List;
import java.util.Optional;

public interface TicketService {
    public Ticket createTicket(Ticket ticket) ;
    public Optional<Ticket> getTicketById(Integer ticketId) ;

    public List<Ticket> getAllBookedTickets() ;
    public void deleteTicket(Integer ticketId);
    public Ticket updateTicket(Ticket ticket);
}
