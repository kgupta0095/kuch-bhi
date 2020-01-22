package com.example.ticketBookingApp.controller;

import com.example.ticketBookingApp.entity.Ticket;
import com.example.ticketBookingApp.service.TicketServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/api")
public class TicketController {

    @Autowired
    private TicketServiceImpl ticketBookingService;

    @Autowired
    public TicketController(TicketServiceImpl aticketBookingService) {
        ticketBookingService = aticketBookingService;
    }
/*@PostMapping(value = "/ticket/create")
    public Ticket createTicket(@RequestBody Ticket ticket) {
        return ticketBookingService.createTicket(ticket);
    }*/

    @GetMapping(value = "/ticket/{ticketId}")
    public Optional<Ticket> getTicketById(@PathVariable("ticketId") Integer ticketId) {
        return ticketBookingService.getTicketById(ticketId);
    }


    @GetMapping(value = "/tickets")
    public List<Ticket> getAllBookedTickets() {
        return ticketBookingService.getAllBookedTickets();
    }

 @DeleteMapping(value = "/ticket/{ticketId}")
    public void deleteTicket(@PathVariable("ticketId") Integer ticketId) {
        ticketBookingService.deleteTicket(ticketId);
    }

    @PutMapping(value = "/ticket")
    public Ticket updateTicket(@RequestBody Ticket ticket) {
        return ticketBookingService.updateTicket(ticket);
    }

}

