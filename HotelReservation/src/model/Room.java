package model;

import java.math.BigDecimal;

public class Room implements IRoomInterface{
    @Override
    public int getRoomNumber(RoomType roomType) {
        return 0;
    }

    @Override
    public BigDecimal getRoomPrice(RoomType roomType) {
        return null;
    }

    @Override
    public RoomType getRoomType(int roomNumber) {
        return null;
    }

    @Override
    public boolean isFree(int roomNumber) {
        return false;
    }
}
