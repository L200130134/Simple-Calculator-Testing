package simplecalculator;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;

/**
 * FXML Controller class
 *
 * @author User-PRO
 */
public class CalcTestingController implements Initializable {

     @FXML
    private TextField inputA;

    @FXML
    private TextField inputB;

    @FXML
    private TextField result;

    @FXML
    private Label message;
        
    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    } 

    @FXML
    void plusButtonAction(ActionEvent event) {
        if (!isNumeric(inputA.getText()) || !isNumeric(inputB.getText())) {
            ErrorMessage();
        } else {
            if (!message.getText().equals("")) {message.setText("");}
            result.setText(Double.toString(plusNumber(parseToDecimal(inputA.getText().replace(",",".")), parseToDecimal(inputB.getText().replace(",",".")))));
        }
    }

    @FXML
    void minusButtonAction(ActionEvent event) {
        if (!isNumeric(inputA.getText()) || !isNumeric(inputB.getText())) {
            ErrorMessage();
        } else {
            if (!message.getText().equals("")) {message.setText("");}
            result.setText(Double.toString(minusNumber(parseToDecimal(inputA.getText().replace(",",".")), parseToDecimal(inputB.getText().replace(",",".")))));
        }
    }
    
    @FXML
    void timesButtonAction(ActionEvent event) {
        if (!isNumeric(inputA.getText()) || !isNumeric(inputB.getText())) {
            ErrorMessage();
        } else {
            if (!message.getText().equals("")) {message.setText("");}
            result.setText(Double.toString(timesNumber(parseToDecimal(inputA.getText().replace(",",".")), parseToDecimal(inputB.getText().replace(",",".")))));
        }
    } 

    @FXML
    void dividedButtonAction(ActionEvent event) {
        if (!isNumeric(inputA.getText()) || !isNumeric(inputB.getText())) {
            ErrorMessage();
        } else {
            if (!message.getText().equals("")) {message.setText("");}
            result.setText(Double.toString(dividedNumber(parseToDecimal(inputA.getText().replace(",",".")), parseToDecimal(inputB.getText().replace(",",".")))));
        }
    }
    
    public void ErrorMessage() {
        result.setText("");
        message.setText("Input cannot contain any letters");
        message.setTextFill(Color.web("#A2351C"));
    }
    
    public static boolean isNumeric(String string) {
      return string.matches("-?\\d+(\\.\\d+)?+(\\,\\d+)?");  //match a number with optional '-' and decimal.
    }
    
    public double parseToDecimal(String input) {
        return Double.parseDouble(input);
    } 
    
    public double plusNumber(double a, double b) {
        return a + b;
    }
    
    public double minusNumber(double a, double b) {
        return a - b;
    }
    
    public double timesNumber(double a, double b) {
        return a * b;
    }
    
    public double dividedNumber(double a, double b) {
        return a / b;
    }  
    
}
