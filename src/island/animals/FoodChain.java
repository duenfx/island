package island.animals;

public class FoodChain {

    public static int getProbability(Animal predator, Animal victim) {
        String pName = predator.getClass().getSimpleName();
        String vName = victim.getClass().getSimpleName();

        if (pName.equals("Wolf")) {
            if (vName.equals("Horse")) return 10;
            if (vName.equals("Deer")) return 15;
            if (vName.equals("Rabbit")) return 60;
            if (vName.equals("Mouse")) return 80;
            if (vName.equals("Goat")) return 60;
            if (vName.equals("Sheep")) return 70;
            if (vName.equals("Boar")) return 15;
            if (vName.equals("Buffalo")) return 10;
            if (vName.equals("Duck")) return 40;
        }

        if (pName.equals("Boa")) {
            if (vName.equals("Fox")) return 15;
            if (vName.equals("Rabbit")) return 20;
            if (vName.equals("Mouse")) return 40;
            if (vName.equals("Duck")) return 10;
        }

        if (pName.equals("Fox")) {
            if (vName.equals("Rabbit")) return 70;
            if (vName.equals("Mouse")) return 90;
            if (vName.equals("Duck")) return 60;
            if (vName.equals("Caterpillar")) return 40;
        }

        if (pName.equals("Bear")) {
            if (vName.equals("Boa")) return 80;
            if (vName.equals("Horse")) return 40;
            if (vName.equals("Deer")) return 80;
            if (vName.equals("Rabbit")) return 80;
            if (vName.equals("Mouse")) return 90;
            if (vName.equals("Goat")) return 70;
            if (vName.equals("Sheep")) return 70;
            if (vName.equals("Boar")) return 50;
            if (vName.equals("Buffalo")) return 20;
            if (vName.equals("Duck")) return 10;
        }

        if (pName.equals("Eagle")) {
            if (vName.equals("Fox")) return 10;
            if (vName.equals("Rabbit")) return 90;
            if (vName.equals("Mouse")) return 90;
            if (vName.equals("Duck")) return 80;
        }

        if (pName.equals("Mouse")) {
            if (vName.equals("Caterpillar")) return 90;
        }

        if (pName.equals("Boar")) {
            if (vName.equals("Mouse")) return 50;
            if (vName.equals("Caterpillar")) return 90;
        }

        if (pName.equals("Duck")) {
            if (vName.equals("Caterpillar")) return 90;
        }

        return 0;
    }
}
