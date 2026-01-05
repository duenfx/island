package island;

import island.animals.predators.*;
import island.animals.herbivores.*;
import island.plants.Plant;

import java.util.concurrent.ThreadLocalRandom;

public class Island {
    private int width;
    private int height;
    private Cell[][] cells;

    public Island(int width, int height) {
        this.width = width;
        this.height = height;
        cells = new Cell[height][width];
        for(int a = 0; a < height; a++) {
            for(int b = 0; b < width; b++) {
                cells[a][b] = new Cell(a, b);
            }
        }
    }

    public void init() {
        for(int i = 0; i < height; i++) {
            for(int j = 0; j < width; j++) {
                Cell cell = cells[i][j];

                int wolfCount = ThreadLocalRandom.current().nextInt(0,31);
                for(int k = 0; k < wolfCount; k++) {
                    cell.addAnimal((new Wolf()));
                }

                int boaCount = ThreadLocalRandom.current().nextInt(0,31);
                for(int k = 0; k < boaCount; k++) {
                    cell.addAnimal((new Boa()));
                }

                int foxCount = ThreadLocalRandom.current().nextInt(0,31);
                for(int k = 0; k < foxCount; k++) {
                    cell.addAnimal((new Fox()));
                }

                int bearCount = ThreadLocalRandom.current().nextInt(0,6);
                for(int k = 0; k < bearCount; k++) {
                    cell.addAnimal((new Bear()));
                }

                int eagleCount = ThreadLocalRandom.current().nextInt(0,21);
                for(int k = 0; k < eagleCount; k++) {
                    cell.addAnimal((new Eagle()));
                }

                int horseCount = ThreadLocalRandom.current().nextInt(0,21);
                for(int k = 0; k < horseCount; k++) {
                    cell.addAnimal((new Horse()));
                }

                int deerCount = ThreadLocalRandom.current().nextInt(0,21);
                for(int k = 0; k < deerCount; k++) {
                    cell.addAnimal((new Deer()));
                }

                int rabbitCount = ThreadLocalRandom.current().nextInt(0,151);
                for(int k = 0; k < rabbitCount; k++) {
                    cell.addAnimal((new Rabbit()));
                }

                int mouseCount = ThreadLocalRandom.current().nextInt(0,501);
                for(int k = 0; k < mouseCount; k++) {
                    cell.addAnimal((new Mouse()));
                }

                int goatCount = ThreadLocalRandom.current().nextInt(0,141);
                for(int k = 0; k < goatCount; k++) {
                    cell.addAnimal((new Goat()));
                }

                int sheepCount = ThreadLocalRandom.current().nextInt(0,141);
                for(int k = 0; k < sheepCount; k++) {
                    cell.addAnimal((new Sheep()));
                }

                int boarCount = ThreadLocalRandom.current().nextInt(0,51);
                for(int k = 0; k < boarCount; k++) {
                    cell.addAnimal((new Boar()));
                }

                int buffaloCount = ThreadLocalRandom.current().nextInt(0,11);
                for(int k = 0; k < buffaloCount; k++) {
                    cell.addAnimal((new Buffalo()));
                }

                int duckCount = ThreadLocalRandom.current().nextInt(0,201);
                for(int k = 0; k < duckCount; k++) {
                    cell.addAnimal((new Duck()));
                }

                int caterpillarCount = ThreadLocalRandom.current().nextInt(0,1001);
                for(int k = 0; k < caterpillarCount; k++) {
                    cell.addAnimal((new Caterpillar()));
                }

                int plantCount = ThreadLocalRandom.current().nextInt(0,201);
                for(int k = 0; k < plantCount; k++) {
                    cell.addPlant((new Plant()));
                }
            }
        }
    }

    public Cell getCell(int a, int b) {
        return cells[a][b];
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void printStats() {
        System.out.println("\n--- СТАТИСТИКА ОСТРОВА ---");
        System.out.println("Рослин: " + countPlants() + " | Тварин: " + countAnimals());

        int rowsToShow = Math.min(height, 10);
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                int count = cells[i][j].getAnimals().size();
                System.out.printf("| %-5d ",  count);
            }
            System.out.println("|");
        }
    }
    private int countAnimals() {
        int total = 0;
        for (Cell[] row : cells) {
            for (Cell cell : row) {
                total += cell.getAnimals().size();
            }
        }
        return total;
    }

    private int countPlants() {
        int total = 0;
        for (Cell[] row : cells) {
            for (Cell cell : row) {
                total += cell.getPlants().size();
            }
        }
        return total;
    }
}
