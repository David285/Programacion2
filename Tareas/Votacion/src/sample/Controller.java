package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    @FXML private Button btn1;
    @FXML private TextField tf1;
    @FXML private TextField tf2;
    @FXML private Label lbl3;

    @FXML
    private void enviar(ActionEvent e) throws Exception {
        String edad = tf2.getText();
        int Edad;
        Edad = Integer.parseInt(edad);
        if (Edad >= 18) {
            lbl3.setText("PUEDE VOTAR");
        }else
            lbl3.setText("NO PUEDE VOTAR");
    }
}
