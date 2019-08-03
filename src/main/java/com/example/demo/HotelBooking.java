package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class HotelBooking {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;
    private String hotelName;
    private Double pricePerNight;
    private int nbOfNights;

    public HotelBooking() {}
    public HotelBooking(String hotelName, Double pricePerNight, int nbOfNights) {
        this.hotelName = hotelName;
        this.pricePerNight = pricePerNight;
        this.nbOfNights = nbOfNights;
    }
    public String getHotelName() {
        return hotelName;
    }

    public Double getPricePerNight() {
        return pricePerNight;
    }
    public int getNbOfNights() {
        return nbOfNights;
    }
    public Double getTotalPrice(){
        return pricePerNight*nbOfNights;
    }
}
