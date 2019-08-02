package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value ="/bookings")
public class BookingController {
    private List<HotelBooking> bookings;

    public BookingController(){
        bookings = new ArrayList<>();
        bookings.add(new HotelBooking("Marriot", 200.50,3));
        bookings.add(new HotelBooking("Ibis", 90.0,4));
        bookings.add(new HotelBooking("Novotel",140.74, 1));

    }
    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<HotelBooking> getAll(){
        return bookings;
    }

}
