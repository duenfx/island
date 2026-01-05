package island.animals;

import island.Cell;
import island.plants.Plant;

public class Herbivore extends Animal {
    public Herbivore(String name, double weight, int speed, double foodNeeded, double currentSatiety) {
        super(name, weight, speed, foodNeeded, currentSatiety);
    }

    @Override
    public void eat(Cell cell) {
        var plants = cell.getPlants();
        if (!plants.isEmpty() && currentSatiety < foodNeeded) {
            Plant plant = plants.get(0);
            plants.remove(plant);
            currentSatiety += plant.getWeight();
            if (currentSatiety > foodNeeded) {
                currentSatiety = foodNeeded;
            }
            System.out.println(name + " з'їв рослину і тепер ситість: " + currentSatiety);
        } else {
            System.out.println(name + " не знайшов їжі або неголодний ще.");
        }
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
