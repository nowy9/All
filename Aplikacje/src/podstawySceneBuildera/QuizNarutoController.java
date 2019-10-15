package podstawySceneBuildera;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class QuizNarutoController
{
    int punkty = 0;
    @FXML
    private Label labelWynik;
    @FXML
    private Label label1;
    @FXML
    private Label label2;
    @FXML
    private Label label3;
    @FXML
    private Label label4;
    @FXML
    private Label label5;
    @FXML
    private Label label6;
    @FXML
    private Label label7;
    @FXML
    private Label label8;
    @FXML
    private Label label9;
    @FXML
    private Label label10;
    @FXML
    private Button button1A;
    @FXML
    private Button button1B;
    @FXML
    private Button button1C;
    @FXML
    private Button button1D;
    @FXML
    private Button button2A;
    @FXML
    private Button button2B;
    @FXML
    private Button button2C;
    @FXML
    private Button button2D;
    @FXML
    private Button button3A;
    @FXML
    private Button button3B;
    @FXML
    private Button button3C;
    @FXML
    private Button button3D;
    @FXML
    private Button button4A;
    @FXML
    private Button button4B;
    @FXML
    private Button button4C;
    @FXML
    private Button button4D;
    @FXML
    private Button button5A;
    @FXML
    private Button button5B;
    @FXML
    private Button button5C;
    @FXML
    private Button button5D;
    @FXML
    private Button button6A;
    @FXML
    private Button button6B;
    @FXML
    private Button button6C;
    @FXML
    private Button button6D;
    @FXML
    private Button button7A;
    @FXML
    private Button button7B;
    @FXML
    private Button button7C;
    @FXML
    private Button button7D;
    @FXML
    private Button button8A;
    @FXML
    private Button button8B;
    @FXML
    private Button button8C;
    @FXML
    private Button button8D;
    @FXML
    private Button button9A;
    @FXML
    private Button button9B;
    @FXML
    private Button button9C;
    @FXML
    private Button button9D;
    @FXML
    private Button button10A;
    @FXML
    private Button button10B;
    @FXML
    private Button button10C;
    @FXML
    private Button button10D;
    @FXML
    private Button zakończQuiz;

    @FXML
    public void dobraOdp1() {
        punkty++;
        label1.setText("Twoja odpowiedź jest dobra. Zdobywasz punkt.");
    }

    @FXML
    public void złaOdp1() {
        label1.setText("Twoja odpowiedź jest zła.");
    }

    @FXML
    public void dobraOdp2() {
        punkty++;
        label2.setText("Twoja odpowiedź jest dobra. Zdobywasz punkt.");
    }

    @FXML
    public void złaOdp2() {
        label2.setText("Twoja odpowiedź jest zła.");
    }

    @FXML
    public void dobraOdp3() {
        punkty++;
        label3.setText("Twoja odpowiedź jest dobra. Zdobywasz punkt.");
    }

    @FXML
    public void złaOdp3() {
        label3.setText("Twoja odpowiedź jest zła.");
    }

    @FXML
    public void dobraOdp4() {
        punkty++;
        label4.setText("Twoja odpowiedź jest dobra. Zdobywasz punkt.");
    }

    @FXML
    public void złaOdp4() {
        label4.setText("Twoja odpowiedź jest zła.");
    }

    @FXML
    public void dobraOdp5() {
        punkty++;
        label5.setText("Twoja odpowiedź jest dobra. Zdobywasz punkt.");
    }

    @FXML
    public void złaOdp5() {
        label5.setText("Twoja odpowiedź jest zła.");
    }

    @FXML
    public void dobraOdp6() {
        punkty++;
        label6.setText("Twoja odpowiedź jest dobra. Zdobywasz punkt.");
    }

    @FXML
    public void złaOdp6() {
        label6.setText("Twoja odpowiedź jest zła.");
    }

    @FXML
    public void dobraOdp7() {
        punkty++;
        label7.setText("Twoja odpowiedź jest dobra. Zdobywasz punkt.");
    }

    @FXML
    public void złaOdp7() {
        label7.setText("Twoja odpowiedź jest zła.");
    }

    @FXML
    public void dobraOdp8() {
        punkty++;
        label8.setText("Twoja odpowiedź jest dobra. Zdobywasz punkt.");
    }

    @FXML
    public void złaOdp8() {
        label8.setText("Twoja odpowiedź jest zła.");
    }

    @FXML
    public void dobraOdp9() {
        punkty++;
        label9.setText("Twoja odpowiedź jest dobra. Zdobywasz punkt.");
    }

    @FXML
    public void złaOdp9() {
        label9.setText("Twoja odpowiedź jest zła.");
    }

    @FXML
    public void dobraOdp10() {
        punkty++;
        label10.setText("Twoja odpowiedź jest dobra. Zdobywasz punkt.");
    }

    @FXML
    public void złaOdp10() {
        label10.setText("Twoja odpowiedź jest zła.");
    }

    @FXML
    public void wynikKońcowy()
    {
        labelWynik.setText("Twój wynik to: " + punkty + " punktów. Dziękuję za udział w quizie.");
    }
}

