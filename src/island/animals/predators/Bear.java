package island.animals.predators;

import island.animals.Predator;

public class Bear extends Predator {
    public Bear() {
        super("Bear", 500, 2, 80, 0);
        this.maxOnCell = 5;
    }
}
