package podstawySceneBuildera;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class KontrolowanieMożeCoś
{
    @FXML
    private Label label;
    @FXML
    private Button buttonA;
    @FXML
    private Button buttonB;
    @FXML
    private Button buttonC;
    @FXML
    private Button buttonD;
    @FXML
    private Label labelka;

    @FXML
    public void odpowiedźDobra()
    {
        labelka.setText("Twoja odpowiedź jest dobra. Gratulacje!");
    }
    @FXML
    public void odpowiedźZła()
    {
        labelka.setText("Twoja odpowiedź jest zła. Prawidłowa odpowiedź to 1410.");
    }

}
