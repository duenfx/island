package island;

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
                cells[a][b] = new Cell();
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
}
