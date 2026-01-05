package island;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        Island island = new Island(10, 10);
        island.init();
        System.out.println("Старт симуляції...");
        island.printStats();
        ScheduledExecutorService service = Executors.newScheduledThreadPool(4);

        service.scheduleAtFixedRate(() -> {

            for (int i = 0; i < island.getHeight(); i++) {
                for (int j = 0; j < island.getWidth(); j++) {
                    Cell cell = island.getCell(i, j);

                    Task task = new Task(cell, island);
                    service.execute(task);
                }
            }

            System.out.println("\n--- Новий день ---");
            island.printStats();

        }, 0, 1, TimeUnit.SECONDS);
    }
}
