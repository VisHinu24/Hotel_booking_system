package com.example.hotel_booking.controller;

import com.example.hotel_booking.model.Booking;
import com.example.hotel_booking.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/booking")
public class BookingController {
    @Autowired
    private BookingService bookingService;

    @PostMapping("/add")
    public Booking addBooking(@RequestBody Booking booking) {
        return bookingService.createBooking(booking);
    }
    @GetMapping("/get")
    public List<Booking> getBookings() {
        return bookingService.getBookings();
    }
    @GetMapping("/{id}")
    public Booking getBookingById(@PathVariable Long id) {
        return bookingService.getOne(id);
    }
}
