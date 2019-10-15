package podstawySceneBuildera;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class InkrementacjaController
{
    @FXML
    private Label label;
    private int i = 0;

    @FXML
    public void inkrementuj()
    {
        label.setText("Obecna wartość to: " + ++i);
    }
}
