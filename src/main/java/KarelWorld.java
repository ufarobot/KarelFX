import java.util.ArrayList;
import java.util.List;

/**
 * Created by Airat Ishimbaev on 23.08.2017.
 */
public class KarelWorld {
    private int rowCount;
    private int colCount;
    private List<Corner> corners;
    private Karel karel;

    // Default world
    public KarelWorld() {
        this.rowCount = 10;
        this.colCount = 10;
        corners = new ArrayList<>();
        karel = new Karel(11 , 1, WDirection.EAST, "INFINITY");
    }

    private class Corner {
        int x, y;
        boolean wallSouth;
        boolean wallWest;
        int beepersCount;
    }

    public class Karel {
        int x;
        int y;
        WDirection direction;
        String beeperCount;

        public Karel(int x, int y, WDirection direction, String beeperCount) {
            this.x = x;
            this.y = y;
            this.direction = direction;
            this.beeperCount = beeperCount;
        }
    }

    @Override
    public String toString() {
        return "KarelWorld{" +
                "rowCount=" + rowCount +
                ", colCount=" + colCount +
                ", corners=" + corners +
                ", karel=" + karel +
                '}';
    }

    public int getRowCount() {
        return rowCount;
    }

    public int getColCount() {
        return colCount;
    }

    public Karel getKarel() {
        return karel;
    }
}
