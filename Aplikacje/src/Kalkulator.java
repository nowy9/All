import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.awt.*;

public class Kalkulator extends Application
{
    @Override
    public void start (Stage primaryStage) throws Exception
    {
        BorderPane layout = new BorderPane();
        layout.getStyleClass().add("background-color");
        Scene scene = new Scene(layout, 400, 400);
        TextField textField = new TextField();
        Label label = new Label ("Wprowadź liczby oddzielając je przecinkami:");
        Label labelek = new Label("Wynik:");
        Button addition = new Button("Oblicz sumę");
        Button subtraction = new Button("Oblicz różnicę");
        Button multiplication = new Button("Oblicz iloczyn");
        Button division = new Button("Oblicz iloraz");
        addition.setOnAction(event ->
        {
            String textFromTextField = textField.getText();
            String[] splittedText = textFromTextField.split(",");
                double suma = 0.0;
                for (String s: splittedText)
                {
                    suma += Double.parseDouble(s);
                }
                labelek.setText("Wynik: " + suma);

        });
        subtraction.setOnAction(event ->
        {
            String textFromTextField = textField.getText();
            String[] splittedText = textFromTextField.split(",");
            double roznica = 0.0;
            roznica =  Double.parseDouble(splittedText[0]);
            for (int i=1;i<splittedText.length;i++)
            {
                String s = splittedText[i];
                roznica = roznica - Double.parseDouble(s);
            }
            labelek.setText("Wynik: " + roznica);

        });

        multiplication.setOnAction(event ->
        {
            String textFromTextField = textField.getText();
            String[] splittedText = textFromTextField.split(",");
            double iloczyn = 1.0;
            for (String s: splittedText)
            {
                iloczyn = iloczyn * Double.parseDouble(s);

            }
            labelek.setText("Wynik: " + iloczyn);

        });

        division.setOnAction(event ->
        {
            String textFromTextField = textField.getText();
            String[] splittedText = textFromTextField.split(",");
            double iloraz = 0.0;
            iloraz =  Double.parseDouble(splittedText[0]);
            for (int i=1;i<splittedText.length;i++)
            {
                String s = splittedText[i];
                iloraz = iloraz / Double.parseDouble(s);
            }
            labelek.setText("Wynik: " + iloraz);

        });

        VBox vBox = new VBox();
        vBox.getChildren().addAll(label, textField, labelek);
        vBox.setAlignment(Pos.CENTER);
        vBox.setSpacing(10);
        layout.setCenter(vBox);
        HBox hBox = new HBox();
        hBox.getChildren().addAll(addition, subtraction, multiplication, division);
        hBox.setAlignment(Pos.BOTTOM_LEFT);
        hBox.setSpacing(19);
        layout.setBottom(hBox);
        scene.getStylesheets().add("StylKalkulatora.css");
        primaryStage.setScene(scene);
        primaryStage.setTitle("Kalkulator");
        primaryStage.show();
    }

}
