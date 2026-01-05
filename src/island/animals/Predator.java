package island.animals;

import island.Cell;

public class Predator extends Animal {
    public Predator(String name, int weight, int speed) {
        super(name, weight, speed);
    }

    @Override
    public void eat(Cell cell) {
        System.out.println(name + " їсть інших тварин.");
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
