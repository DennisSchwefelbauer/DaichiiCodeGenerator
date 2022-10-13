package de.fiatdachiigenerator;

import de.exceptionHandling.PopupWindowError;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ControllerMain implements Initializable {

    @FXML
    private TextField input1;

    @FXML
    private TextField input2;

    @FXML
    private TextField input3;

    @FXML
    private TextField input4;

    @FXML
    private TextField output1;

    @FXML
    private TextField output2;

    @FXML
    private TextField output3;

    @FXML
    private TextField output4;

    int code1;
    int code2;
    int code3;
    int code4;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        output1.setDisable(true);
        output2.setDisable(true);
        output3.setDisable(true);
        output4.setDisable(true);
    }

    @FXML
    void buttonGenerate_Clicked(ActionEvent event) {
        if (!input1.getText().isEmpty() && !input2.getText().isEmpty() && !input3.getText().isEmpty() && !input4.getText().isEmpty()) {
            int number1 = Integer.parseInt(input1.getText());
            int number2 = Integer.parseInt(input2.getText());
            int number3 = Integer.parseInt(input3.getText());
            int number4 = Integer.parseInt(input4.getText());

            System.out.println(number1 + " " + number2 + " " + number3 + " " + number4);

            if (number1 == 0 && number2 == 0 && number3 == 0) {
                switch (number4) {
                    case 0: code1 = 0; break;
                    case 1: code1 = 9; break;
                    case 2: code1 = 8; break;
                    case 3: code1 = 7; break;
                    case 4: code1 = 6; break;
                    case 5: code1 = 5; break;
                    case 6: code1 = 4; break;
                    case 7: code1 = 3; break;
                    case 8: code1 = 2; break;
                    case 9: code1 = 1; break;
                }
                output1.setText(String.valueOf(code1));
            } else {
                switch (number4) {
                    case 0: code1 = 9; break;
                    case 1: code1 = 8; break;
                    case 2: code1 = 7; break;
                    case 3: code1 = 6; break;
                    case 4: code1 = 5; break;
                    case 5: code1 = 4; break;
                    case 6: code1 = 3; break;
                    case 7: code1 = 2; break;
                    case 8: code1 = 1; break;
                    case 9: code1 = 0; break;
                }
                output1.setText(String.valueOf(code1));
            }

            if (number1 == 0 && number2 == 0) {
                switch (number3) {
                    case 0: code2 = 0; break;
                    case 1: code2 = 9; break;
                    case 2: code2 = 8; break;
                    case 3: code2 = 7; break;
                    case 4: code2 = 6; break;
                    case 5: code2 = 5; break;
                    case 6: code2 = 4; break;
                    case 7: code2 = 3; break;
                    case 8: code2 = 2; break;
                    case 9: code2 = 1; break;
                }
                output2.setText(String.valueOf(code2));
            } else {
                switch (number3) {
                    case 0: code2 = 9; break;
                    case 1: code2 = 8; break;
                    case 2: code2 = 7; break;
                    case 3: code2 = 6; break;
                    case 4: code2 = 5; break;
                    case 5: code2 = 4; break;
                    case 6: code2 = 3; break;
                    case 7: code2 = 2; break;
                    case 8: code2 = 1; break;
                    case 9: code2 = 0; break;
                }
                output2.setText(String.valueOf(code2));
            }

            if (number1 == 0) {
                switch (number2) {
                    case 0: code3 = 0; break;
                    case 1: code3 = 9; break;
                    case 2: code3 = 8; break;
                    case 3: code3 = 7; break;
                    case 4: code3 = 6; break;
                    case 5: code3 = 5; break;
                    case 6: code3 = 4; break;
                    case 7: code3 = 3; break;
                    case 8: code3 = 2; break;
                    case 9: code3 = 1; break;
                }
                output3.setText(String.valueOf(code3));
            } else {
                switch (number2) {
                    case 0: code3 = 9; break;
                    case 1: code3 = 8; break;
                    case 2: code3 = 7; break;
                    case 3: code3 = 6; break;
                    case 4: code3 = 5; break;
                    case 5: code3 = 4; break;
                    case 6: code3 = 3; break;
                    case 7: code3 = 2; break;
                    case 8: code3 = 1; break;
                    case 9: code3 = 0; break;
                }
                output3.setText(String.valueOf(code3));
            }

            switch (number1) {
                case 0: code4 = 0; break;
                case 1: code4 = 9; break;
                case 2: code4 = 8; break;
                case 3: code4 = 7; break;
                case 4: code4 = 6; break;
                case 5: code4 = 5; break;
                case 6: code4 = 4; break;
                case 7: code4 = 3; break;
                case 8: code4 = 2; break;
                case 9: code4 = 1; break;
            }
            output4.setText(String.valueOf(code4));

        } else {
            PopupWindowError.display("Alle Felder müssen ausgefüllt sein!");
        }
    }

    @FXML
    void imageHelp_Clicked(MouseEvent event) {
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("help.fxml"));
        Scene scene;
        try {
            scene = new Scene(fxmlLoader.load());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        stage.setTitle("Info");
        stage.setResizable(false);
        stage.setScene(scene);
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.showAndWait();
    }

}
