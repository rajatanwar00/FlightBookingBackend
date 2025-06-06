package com.example.flightBooking.model;

public class Seat {
    private String seatId;
    private boolean isBooked;
    private String bookedBy;

    public Seat(String seatId){
        this.seatId=seatId;
        this.isBooked=false;
    }

    public synchronized boolean book(String passenger){
        if(!this.isBooked){
            this.isBooked=true;
            this.bookedBy=passenger;
            return true;
        }
        else{
            return false;
        }
    }

    public String getSeatId(){
        return seatId;
    }

    public String getBookedBy(){
        return bookedBy;
    }

    public boolean isBooked(){
        return isBooked;
    }
}
