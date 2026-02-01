package com.example.hotel_booking.service;

import com.example.hotel_booking.model.Payment;
import com.example.hotel_booking.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentService {
    @Autowired
    private PaymentRepository paymentRepo;

    public Payment save(Payment payment) {
        return paymentRepo.save(payment);
    }
    public List<Payment> getAll() {
        return paymentRepo.findAll();
    }
    public Payment getPayment(Long id) {
        return paymentRepo.findById(id).orElse(null);
    }
}
