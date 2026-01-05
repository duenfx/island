package island.animals.herbivores;

import island.animals.Herbivore;

public class Rabbit extends Herbivore {
    public Rabbit() {
        super("Rabbit", 2, 2, 0.45, 0);
        this.maxOnCell = 150;
    }
}
