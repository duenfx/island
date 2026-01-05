package island.animals.predators;

import island.animals.Predator;

public class Wolf extends Predator {
    public Wolf() {
        super("Wolf", 50, 3, 8, 0);
        this.maxOnCell = 30;
    }
}
