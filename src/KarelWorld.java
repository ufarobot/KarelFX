import java.io.Serializable;

/**
 * Created by Airat Ishimbaev on 23.08.2017.
 */
public class KarelWorld implements Serializable {
    private int rows;
    private int cols;
    private Corner[][] map;

    public KarelWorld(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
    }

    private class Corner {
        boolean wallSouth;
        boolean wallWest;
        int nBeepers;
    }
}
