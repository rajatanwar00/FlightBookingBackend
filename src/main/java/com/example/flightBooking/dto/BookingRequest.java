package com.example.flightBooking.dto;

public class BookingRequest {
    private String seatId;
    private String passengerName;

    public String getSeatId(){
        return seatId;
    }

    public void setSeatId(String seatId){
        this.seatId=seatId;
    }

    public String getPassengerName(){
        return this.passengerName;
    }

    public void setPassengerName(String passengerName){
        this.passengerName=passengerName;
    }
}
