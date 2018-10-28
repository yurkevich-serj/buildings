package by.itacademy.building;

import by.itacademy.exceptions.*;
import java.util.ArrayList;
import java.util.List;
import by.itacademy.building.*;

public class Room {
    private String roomName;
    private int square;
    private int windows;
    private int illumination;


    private List<Lamp> lamps = new ArrayList<Lamp>();
    private List<Furniture> furn = new ArrayList<Furniture>();


    public Room(String roomName, int square, int windows) throws IlluminanceLimitException{
        if(windows>5) {
            throw new IlluminanceLimitException("Нужно уменьшить число окон!");
        }
        this.roomName = roomName;
        this.square = square;
        this.windows = windows;
        illumination = windows*700;

    }


    public void add(Lamp lamp) throws IlluminanceLimitException {
        if(illumination + lamp.getLamp() > 4000)  {
            throw new IlluminanceLimitException("Нужно уменьшить число лампочек");
        }
        lamps.add(lamp);
    }
    public int checkIllumination () {
        int sum = 0;
        for(Lamp i : lamps)
            sum += i.getLamp();
        return sum;
    }
    public void add(Furniture furniture) {
        furn.add(furniture);
    }
    public void information(){
         System.out.print("Ocвещенность= " + ((this.windows*700)+checkIllumination()) + "(количество окон- " +
                 this.windows + " по 700лк, количество лампочек- " + lamps.size()+ "(");
        for(Lamp lamp: lamps ){
            System.out.print(lamp.getLamp() + "лк,") ;
        }
        System.out.println("))");
    }

    public List<Lamp> getLamps() {
        return lamps;
    }

    public List<Furniture> getFurn() {
        return furn;
    }

    public String getRoomName() {
        return roomName;
    }

    public int getSquare() {
        return square;
    }

    public int getWindows() {
        return windows;
    }

    public int getIllumination() {
        return illumination;
    }
}
