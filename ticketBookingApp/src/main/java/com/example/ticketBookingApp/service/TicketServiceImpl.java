package com.example.ticketBookingApp.service;

import com.example.ticketBookingApp.dao.TicketBookingDAO;
import com.example.ticketBookingApp.entity.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TicketServiceImpl {

    @Autowired
    private TicketBookingDAO ticketBookingDao;

    @Autowired
    public TicketServiceImpl(TicketBookingDAO aticketBookingDao) {
        ticketBookingDao = aticketBookingDao;
    }


   /* public Ticket createTicket(Ticket ticket) {
        return ticketBookingDao.save(ticket);
    }*/
    public Optional<Ticket> getTicketById(Integer ticketId) {

        return ticketBookingDao.findById(ticketId);
    }

    public List<Ticket> getAllBookedTickets() {
        return ticketBookingDao.findAll();
    }
    public void deleteTicket(Integer ticketId) {
        ticketBookingDao.deleteById(ticketId);
    }
    public Ticket updateTicket(Ticket ticket) {
        ticket.setTicketId(0);
        Ticket updatedTicket = ticketBookingDao.save(ticket);
        return updatedTicket;
    }
}
