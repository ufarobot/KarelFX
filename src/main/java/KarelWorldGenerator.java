import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;

/**
 * Created by Airat Ishimbaev on 24.08.2017.
 */
public class KarelWorldGenerator {
    public static void main(String[] args) {
        KarelWorld world = new KarelWorld();
        System.out.println(world.toString());
        try {
            Writer file = new FileWriter("src/main/resources/worlds/default.world");
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            gson.toJson(world, file);
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
