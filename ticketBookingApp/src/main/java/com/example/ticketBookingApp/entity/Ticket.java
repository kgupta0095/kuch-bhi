package com.example.ticketBookingApp.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@NoArgsConstructor
@Entity
@Table(name="Ticket")
public class Ticket {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="ticket_id")
    private Integer ticketId;

    @Column(name="passenger_name",nullable=false)
    private String passengerName;

    @Column(name="booking_date")
    private String bookingDate;
    @Column(name="source_station")
    private String sourceStation;
    @Column(name="dest_station")
    private String destStation;
    @Column(name="email")
    private String email;

    public Ticket(String passengerName, String bookingDate, String sourceStation, String destStation, String email) {
        this.passengerName = passengerName;
        this.bookingDate = bookingDate;
        this.sourceStation = sourceStation;
        this.destStation = destStation;
        this.email = email;
    }
}
