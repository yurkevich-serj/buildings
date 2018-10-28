package by.itacademy.building;

import by.itacademy.exceptions.IlluminanceLimitException;

import java.util.*;

public class Building {
    private String name;
    private List<Room> roomList = new ArrayList<>();


    public String getName() {
        return name;
    }

    public Building(String name) {
        this.name = name;
    }

    public void addRoom(String name, int square, int windows){
        try {
            roomList.add(new Room(name,square,windows));
        }
        catch (IlluminanceLimitException e) {
            System.out.println("Ошибка! " + e.getMessage());
        }


    }

    public void add(int i, Lamp lamp) {
        Room room = roomList.get(i - 1);
        try {
            room.add(lamp);
        }
        catch (IlluminanceLimitException e) {
            System.out.println("Ошибка! " + e.getMessage());
        }

    }

    public void add(int i, Furniture furn) {
        Room room = roomList.get(i-1);
        room.add(furn);
    }

    public void information () {
        for(Room room: roomList){
            System.out.println(room.getRoomName());
            room.information();
        }
    }
}

