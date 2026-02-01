package com.example.hotel_booking.controller;

import com.example.hotel_booking.model.Payment;
import com.example.hotel_booking.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/payment")
public class PaymentController {
    @Autowired
    private PaymentService paymentService;

    @PostMapping("/add")
    public Payment addPayment(@RequestBody Payment payment) {
        return paymentService.save(payment);
    }
    @GetMapping("get")
    public List<Payment> getPayment() {
        return paymentService.getAll();
    }


}
