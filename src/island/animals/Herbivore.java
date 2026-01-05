package island.animals;

import island.Cell;

public class Herbivore extends Animal {
    public Herbivore(String name, int weight, int speed) {
        super(name, weight, speed);
    }

    @Override
    public void eat(Cell cell) {
        System.out.println(name + " їсть рослини.");
    }

    @Override
    public void reproduce(Cell cell) {
        System.out.println(name + " розмножується.");
    }

    @Override
    public void move(Cell cell) {
        System.out.println(name + " пересувається");
    }
}
