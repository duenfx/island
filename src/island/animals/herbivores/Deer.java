package island.animals.herbivores;

import island.animals.Herbivore;

public class Deer extends Herbivore {
    public Deer() {
        super("Deer", 300, 4, 50, 4);
        this.maxOnCell = 20;
    }
}
