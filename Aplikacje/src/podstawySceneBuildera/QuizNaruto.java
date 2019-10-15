package podstawySceneBuildera;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class QuizNaruto extends Application
{

    @Override
    public void start(Stage primaryStage) throws Exception
    {
        FXMLLoader fxmlLoader = new FXMLLoader(QuizNaruto.class.getResource("Naruto.fxml"));
        Parent layout = fxmlLoader.load();
        Scene scene = new Scene (layout);
        scene.getStylesheets().add("StylKalkulatora.css");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
