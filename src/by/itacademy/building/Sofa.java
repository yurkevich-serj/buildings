package by.itacademy.building;

public class Sofa extends Furniture{
    public String name;
    public int square;

    public Sofa(String name, int square) {
        this.name = name;
        this.square = square;
    }

    public int getSquare() {
        return square;
    }
}
