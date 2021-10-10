package com.example.kj.service;

import com.example.kj.model.Room;
import com.example.kj.repository.RoomRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class RoomService {
    private final RoomRepository roomRepository;

    public List<Room> getRooms() {
        return roomRepository.findAll();
    }

    public Room getRoom(Long userId) {
        return roomRepository.findById(userId).orElse(null);
    }

    public void createRoom(Room room) {
        roomRepository.save(room);
    }

    public void updateRoom(Long roomId, Room room) {
        room.setId(roomId);
        roomRepository.save(room);
    }

    public void deleteRoom(Long roomId) {
        roomRepository.deleteById(roomId);
    }

}
