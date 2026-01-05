package island.animals;

import island.Cell;

public abstract class Animal {
    protected String name;
    protected int weight;
    protected int speed;

    public Animal(String name, int weight, int speed) {
        this.name = name;
        this.weight = weight;
        this.speed = speed;
    }

    public abstract void eat(Cell cell);

    public abstract void reproduce(Cell cell);

    public abstract void move(Cell cell);

}
