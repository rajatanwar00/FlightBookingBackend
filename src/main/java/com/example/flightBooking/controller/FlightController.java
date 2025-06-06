package com.example.flightBooking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.flightBooking.dto.BookingRequest;
import com.example.flightBooking.model.Seat;
import com.example.flightBooking.service.FlightService;

@RestController
@RequestMapping("/flights")
public class FlightController {
    
    @Autowired
    private FlightService flightservice;

    @GetMapping("/{id}/seats")
    public Seat[][] getSeats(@PathVariable String id){
        return flightservice.getSeats(id);
    }

    @PostMapping("/{id}/book")
    public String bookSeat(@PathVariable String id, @RequestBody BookingRequest request){
        boolean booked=flightservice.bookSeat(request.getSeatId(), id, request.getPassengerName());
        return booked?"Success!!":"Booking failed, seat already taken";
    }
}
