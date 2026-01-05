package island;

import island.animals.Animal;
import island.plants.Plant;

import java.util.ArrayList;
import java.util.List;

public class Cell {
    private List<Animal> animals;
    private List<Plant> plants;

    public Cell() {
        animals = new ArrayList<>();
        plants = new ArrayList<>();
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
}
