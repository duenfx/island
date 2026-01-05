package island.animals.herbivores;

import island.animals.Herbivore;

public class Sheep extends Herbivore {
    public Sheep() {
        super("Sheep", 70, 3, 15, 0);
        this.maxOnCell = 140;
    }
}
