import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * Created by Airat Ishimbaev on 24.08.2017.
 */
public class KarelWorldReader {
    public static void main(String[] args) {
        KarelWorld world = null;
        try {
            FileInputStream fileInputStream = new FileInputStream("worlds/default.ser");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            world = (KarelWorld) objectInputStream.readObject();
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }
        if (world != null) {
            System.out.println(world.getKarel().x);
        }
    }
}
