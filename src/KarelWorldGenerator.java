import java.io.*;

/**
 * Created by Airat Ishimbaev on 24.08.2017.
 */
public class KarelWorldGenerator {
    public static void main(String[] args) {
        KarelWorld world = new KarelWorld();
        try {
            File file = new File("worlds/default.ser");
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(world);
            objectOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
