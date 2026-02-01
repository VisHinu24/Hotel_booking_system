package com.example.hotel_booking.repository;

import com.example.hotel_booking.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long>{
}
