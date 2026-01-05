package island;

import island.animals.Animal;
import island.plants.Plant;

import java.util.concurrent.ThreadLocalRandom;

public class Task implements Runnable {
    private final Cell cell;
    private final Island island;

    public Task(Cell cell, Island island) {
        this.cell = cell;
        this.island = island;
    }

    @Override
    public void run() {
        if (cell.getPlants().size() < 200 && ThreadLocalRandom.current().nextBoolean()) {
            cell.addPlant(new Plant());
        }
        for (Animal animal : cell.getAnimals()) {
            if (!animal.isAlive) continue;
            try {
                animal.eat(cell);
                animal.reproduce(cell);
            } catch (Exception e) {
            }
        }
        for (Animal animal : cell.getAnimals()) {
            if (!animal.isAlive) continue;

            try {
                animal.move(cell, island);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        cell.getAnimals().removeIf(animal -> !animal.isAlive);
    }
}
