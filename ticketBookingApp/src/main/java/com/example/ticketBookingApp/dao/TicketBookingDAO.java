package com.example.ticketBookingApp.dao;

import com.example.ticketBookingApp.entity.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource
public interface TicketBookingDAO extends JpaRepository<Ticket, Integer> {
}
