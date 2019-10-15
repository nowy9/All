package podstawySceneBuildera;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class DzialaniaMatematyczneController
{


    @FXML
    private TextField textField;
    @FXML
    private Button button1;
    @FXML
    private Button button2;
    @FXML
    private Button button3;
    @FXML
    private Button button4;
    @FXML
    private Label wynik;

    private String textFromTextField = textField.getText();
    private String[] splittedText = textFromTextField.split(",");
      for (String s: splittedText)
        {
            double val1 = Double.parseDouble(s);
        }



    @FXML
    public void inkrementuj()
    {
        wynik.setText("Wynik: " + s++);
    }
    @FXML
    public void dekrementuj()
    {
        wynik.setText("Wynik: " + s--);
    }
    @FXML
    public void pierwiastkuj()
    {
        wynik.setText("Wynik: " + Math.sqrt(s));
    }
    @FXML
    public void poteguj()
    {
        wynik.setText("Wynik: " + Math.pow(s, 2));
    }

}
