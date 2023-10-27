package com.vishnu.RoomApp.repo;

import com.vishnu.RoomApp.model.Room;
import com.vishnu.RoomApp.model.Type;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IRoomRepo extends JpaRepository<Room,Integer> {
    List<Room> findByRoomPrice(double price);

    List<Room> findByRoomPriceLessThanEqualAndRoomAvailable(double price, boolean b);

    List<Room> findByRoomPriceLessThanEqualOrRoomAvailable(double price, boolean b);

    List<Room> findByRoomTypeOrRoomAvailableOrderByRoomPrice(Type type, boolean b);
}
