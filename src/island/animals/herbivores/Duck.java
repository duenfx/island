package island.animals.herbivores;

import island.animals.Herbivore;

public class Duck extends Herbivore {
    public Duck() {
        super("Duck", 1, 4, 0.15, 0);
        this.maxOnCell = 200;
    }
}
