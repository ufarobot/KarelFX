import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 * Created by Airat Ishimbaev on 23.08.2017.
 */
public class KarelApp extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Karel");
        primaryStage.setScene(new Scene(createContent()));
        primaryStage.show();
    }

    private Parent createContent() {
        BorderPane root = new BorderPane();
        root.setCenter(new KarelWorldView());
        return root;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
