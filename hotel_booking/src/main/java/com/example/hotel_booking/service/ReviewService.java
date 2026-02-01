package com.example.hotel_booking.service;

import com.example.hotel_booking.model.Review;
import com.example.hotel_booking.repository.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ReviewService {
    @Autowired
    private ReviewRepository reviewRepo;
    public Review save(Review review) {
        return reviewRepo.save(review);
    }
    public List<Review> getAll() {
        return reviewRepo.findAll();
    }
    public Review getReview(Long id) {
        return reviewRepo.findById(id).orElse(null);
    }
    public void deleteReview(Long id) {
        reviewRepo.deleteById(id);
    }
}
