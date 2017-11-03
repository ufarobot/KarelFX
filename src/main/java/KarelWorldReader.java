import com.google.gson.Gson;

import java.io.*;

/**
 * Created by Airat Ishimbaev on 24.08.2017.
 */
public class KarelWorldReader {
    public static void main(String[] args) {
        KarelWorld world = null;
        try {
            Reader reader = new FileReader("src/main/resources/worlds/default.w");
            Gson gson = new Gson();
            world = gson.fromJson(reader, KarelWorld.class);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        if (world != null) {
            System.out.println(world.getKarel().x);
        }
    }
}
