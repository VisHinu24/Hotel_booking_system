package com.example.hotel_booking.repository;

import com.example.hotel_booking.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment,Long>{
}
