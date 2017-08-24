import java.io.Serializable;

/**
 * Created by Airat Ishimbaev on 23.08.2017.
 */
public class KarelWorld implements Serializable {
    private int rows;
    private int cols;
    private Corner[][] map;
    private Karel karel;

    // Default world
    public KarelWorld() {
        this.rows = 10;
        this.cols = 10;
        map = new Corner[cols + 1][rows + 1];
        karel = new Karel(1 , 1, WDirection.EAST, Integer.MAX_VALUE / 2);
    }

    private class Corner implements Serializable {
        boolean wallSouth;
        boolean wallWest;
        int nBeepers;
    }

    public class Karel implements Serializable {
        int x;
        int y;
        WDirection dir;
        int nBeepers;

        public Karel(int x, int y, WDirection dir, int nBeepers) {
            this.x = x;
            this.y = y;
            this.dir = dir;
            this.nBeepers = nBeepers;

        }
    }

    public int getRows() {
        return rows;
    }

    public int getCols() {
        return cols;
    }

    public Karel getKarel() {
        return karel;
    }
}
