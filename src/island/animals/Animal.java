package island.animals;

import island.Cell;

public abstract class Animal {
    protected String name;
    protected double weight;
    protected int speed;
    protected double foodNeeded;
    protected double currentSatiety;
    protected boolean isAlive = true;

    public Animal(String name, double weight, int speed, double foodNeeded, double currentSatiety) {
        this.name = name;
        this.weight = weight;
        this.speed = speed;
        this.foodNeeded = foodNeeded;
        this.currentSatiety = currentSatiety;
    }

    public abstract void eat(Cell cell);

    public abstract void reproduce(Cell cell);

    public abstract void move(Cell cell);

}
