package com.example.hotel_booking.service;

import com.example.hotel_booking.model.Booking;
import com.example.hotel_booking.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingService {
    @Autowired
    private BookingRepository bookingRepo;
    public Booking createBooking(Booking booking) {
        return bookingRepo.save(booking);
    }
    public List<Booking> getBookings() {
        return bookingRepo.findAll();
    }
    public Booking getOne(Long id) {
        return bookingRepo.findById(id).orElse(null);
    }
    public void deleteBooking(Long id) {
        bookingRepo.deleteById(id);
    }
}
