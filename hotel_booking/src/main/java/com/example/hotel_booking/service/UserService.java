package com.example.hotel_booking.service;

import com.example.hotel_booking.model.User;
import com.example.hotel_booking.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepo;

    public User saveUser(User user) {
        return userRepo.save(user);
    }
    public List<User> getAllUsers() {
        return userRepo.findAll();
    }
    public User getUser(Long id) {
        return userRepo.findById(id).orElse(null);
    }
    public void deleteUser(Long id) {
        userRepo.deleteById(id);
    }
}
