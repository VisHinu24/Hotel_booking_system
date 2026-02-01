package com.example.hotel_booking.service;

import com.example.hotel_booking.model.Room;
import com.example.hotel_booking.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class RoomService {
    @Autowired
    private RoomRepository roomRepo;
    public Room save(Room room) {
        return roomRepo.save(room);
    }
    public List<Room> getAll() {
        return roomRepo.findAll();
    }
    public Room getRoom(Long id) {
        return roomRepo.findById(id).orElse(null);
    }
    public void deleteRoom(Long id) {
        roomRepo.deleteById(id);
    }
}
