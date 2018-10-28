import by.itacademy.building.*;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Building first = new Building("Здание 1");
        first.addRoom("комната 1", 120, 3);
        first.addRoom("комната 2", 400, 5);
        first.add(1, new Lamp(150));
        first.add(1, new Lamp(250));
        first.add(2, new Lamp(100));
        first.add(1, new Table("Table",10));
        first.add(1, new Table("Table",11));
        first.add(1, new Chair("Chair", 20));
        first.information();

    }
}
