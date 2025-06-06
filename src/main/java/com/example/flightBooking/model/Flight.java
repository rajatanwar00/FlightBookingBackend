package com.example.flightBooking.model;
import java.util.*;

public class Flight {
    private String flightId;
    private Seat[][] seatMatrix;

    public Flight(String flightId, int rows, int cols){
        this.flightId=flightId;
        this.seatMatrix=new Seat[rows][cols];

        for(int i=0;i<rows;i++){
            for(int j=1;j<=cols;j++){
                char row=(char)('A'+i);
                seatMatrix[i][j-1]=new Seat(row+Integer.toString(j));
            }
        }
    }

    public synchronized boolean bookSeat(String seatId, String passenger){
        for(Seat[] row:seatMatrix){
            for(Seat seat:row){
                if(seat.getSeatId().equals(seatId)){
                    return seat.book(passenger);
                }
            }
        }

        return false;
    }

    public Seat[][] getSeatMatrix(){
        return seatMatrix;
    }

    public String getFlightId(){
        return flightId;
    }
}
