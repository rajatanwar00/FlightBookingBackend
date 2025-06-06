package com.example.flightBooking.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.example.flightBooking.model.Flight;
import com.example.flightBooking.model.Seat;

@Service
public class FlightService {
    private Map <String, Flight> flights=new HashMap<>();

    public FlightService(){
        flights.put("FL100", new Flight("FL100",4,3));
    }

    public Seat[][] getSeats(String flightId){
        return flights.get(flightId).getSeatMatrix();
    }

    public boolean bookSeat(String seatId, String flightId, String passenger){
        return flights.get(flightId).bookSeat(seatId, passenger);
    }
}
