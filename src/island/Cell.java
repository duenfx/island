package island;

import island.animals.Animal;
import island.plants.Plant;

import java.util.ArrayList;
import java.util.List;

public class Cell {
    private final int row;
    private final int column;
    private List<Animal> animals;
    private List<Plant> plants;

    public Cell(int row, int column) {
        this.row = row;
        this.column = column;
        animals = new ArrayList<>();
        plants = new ArrayList<>();
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public List<Plant> getPlants() {
        return plants;
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void addPlant(Plant plant) {
        plants.add(plant);
    }

    public void removeAnimal(Animal animal) {
        animals.remove(animal);
    }
}
