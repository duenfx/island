package island.animals;

import island.Cell;

import java.util.Iterator;
import java.util.concurrent.ThreadLocalRandom;

public class Predator extends Animal {
    public Predator(String name, double weight, int speed, double foodNeeded, double currentSatiety) {
        super(name, weight, speed, foodNeeded, currentSatiety);
    }

    @Override
    public void eat(Cell cell) {
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

                    System.out.println(this.name + " з'їв " + victim.getClass().getSimpleName());
                    victim.die();
                    iterator.remove();
                    return;
                }
            }
        }
        System.out.println(this.name + " нікого не спіймав.");
    }

    @Override
    public void reproduce(Cell cell) {
        System.out.println(name + " розмножується.");
    }
}
