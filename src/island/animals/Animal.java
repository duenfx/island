package island.animals;

import island.Cell;
import island.Island;

import java.util.concurrent.ThreadLocalRandom;

public abstract class Animal {
    protected String name;
    protected double weight;
    protected int speed;
    protected double foodNeeded;
    protected double currentSatiety;
    protected boolean isAlive = true;
    protected int maxOnCell;

    public Animal(String name, double weight, int speed, double foodNeeded, double currentSatiety) {
        this.name = name;
        this.weight = weight;
        this.speed = speed;
        this.foodNeeded = foodNeeded;
        this.currentSatiety = currentSatiety;
    }

    public double getWeight() {
        return weight;
    }

    public abstract void eat(Cell cell);

    public abstract void reproduce(Cell cell);

    public void move(Cell currentCell, Island island) {
        if (speed == 0) {
            return;
        }
        int moveX = ThreadLocalRandom.current().nextInt(-speed, speed + 1);
        int moveY = ThreadLocalRandom.current().nextInt(-speed, speed + 1);

        if (moveX == 0 && moveY == 0) {
            return;
        }

        int currentX = currentCell.getColumn();
        int currentY = currentCell.getRow();
        int newX = currentX + moveX;
        int newY = currentY + moveY;

        if (newX >= 0 && newX < island.getWidth() && newY >= 0 && newY < island.getHeight()) {
            Cell destination = island.getCell(newY, newX);
            long countSameSpecies = destination.getAnimals().stream()
                    .filter(a -> a.getClass() == this.getClass())
                    .count();
            if (countSameSpecies < maxOnCell) {
                currentCell.removeAnimal(this);
                destination.addAnimal(this);
                System.out.println(name + " перейшов з [" + currentY + "," + currentX + "] до [" + newY + "," + newX + "]");
            } else {
                System.out.println(name + " хотів піти в [" + newY + "," + newX + "], але там немає місця.");
            }
        }
    }

    public void die() {
        isAlive = false;
    }

}
