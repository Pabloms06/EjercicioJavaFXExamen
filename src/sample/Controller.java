package sample;

import javafx.fxml.FXML;

import java.awt.*;


public class Controller {

    @FXML
    private Label number;

    @FXML
    private TextField text;

    @FXML
    private Button button;


    @FXML
    private void Numeroaleatorio() {
        int numero = (int) (Math.random() * 100 + 1);
        number.setText(String.valueOf(numero));
    }

    @FXML
    private void mismo() {
        String texto = text.getText();
        

    }
}
