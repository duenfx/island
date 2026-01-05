package island.animals;

import island.Cell;
import island.plants.Plant;

import java.util.Iterator;
import java.util.concurrent.ThreadLocalRandom;

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
            return;
        }
        var animals = cell.getAnimals();
        Iterator<Animal> iterator = animals.iterator();
        while (iterator.hasNext()) {
            Animal victim = iterator.next();
            if (this == victim || this.getClass() == victim.getClass()) {
                continue;
            }
            int chance = FoodChain.getProbability(this, victim);
            if (chance > 0) {
                int dice = ThreadLocalRandom.current().nextInt(100);
                if (dice < chance) {
                    double foodGained = victim.getWeight();
                    if (this.currentSatiety + foodGained > this.foodNeeded) {
                        this.currentSatiety = this.foodNeeded;
                    } else {
                        this.currentSatiety += foodGained;
                    }
                    victim.die();
                    cell.removeAnimal(victim);
                    return;
                }
            }
        }
    }
    @Override
    public void reproduce(Cell cell) {
    }
}
