package com.example.hotel_booking.service;

import com.example.hotel_booking.model.Cancellation;
import com.example.hotel_booking.repository.CancellationRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CancellationService {
    @Autowired
    private CancellationRepository cancellationRepo;
    public Cancellation save(Cancellation cancellation) {
        return cancellationRepo.save(cancellation);
    }
    public List<Cancellation> getAll() {
        return cancellationRepo.findAll();
    }
    public Cancellation getCancellation(Long id) {
        return cancellationRepo.findById(id).orElse(null);
    }
    public void deleteCancellation(Long id) {
        cancellationRepo.deleteById(id);
    }
}
