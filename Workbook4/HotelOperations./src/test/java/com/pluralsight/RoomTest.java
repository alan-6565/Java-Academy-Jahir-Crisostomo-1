package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {

    @Test
    public void room_Should_check_in() {

        // arrange
        Room room = new Room(2, 2.50, false, false);

        // act
        Room.checkIn();

        //assert

        Room.checkIn();


    }

    @Test
    public void room_Should_check_out() {

        // arrange
        Room room = new Room(2, 2.50, true, false);

        // act
        Room.checkOut();

        //assert

        Room.checkOut();


    }

    @Test
    public void room_Should_Cleaned() {

        // arrange
        Room room = new Room(2, 2.50, true, true);

        // act
        Room.cleanRoom();

        //assert

        Room.cleanRoom();


    }



}