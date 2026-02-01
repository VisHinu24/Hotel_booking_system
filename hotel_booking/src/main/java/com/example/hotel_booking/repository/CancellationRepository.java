package com.example.hotel_booking.repository;

import com.example.hotel_booking.model.Cancellation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CancellationRepository extends JpaRepository<Cancellation,Long> {
}
