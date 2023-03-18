package model;

import java.math.BigDecimal;

public interface IRoomInterface {
    int getRoomNumber(RoomType roomType);
    BigDecimal getRoomPrice(RoomType roomType);
    RoomType getRoomType(int roomNumber);
    boolean isFree(int roomNumber);
}
