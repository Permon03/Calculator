package com.java_projects.calculator;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.text.TextFlow;

public class MainController {
    @FXML
    public TextField firstnumber;
    @FXML
    protected TextField secondnumber;
    @FXML
    protected Button plus;
    @FXML
    protected Button minus;
    @FXML
    protected Button mult;
    @FXML
    protected Button divide;
    @FXML
    protected Label result;
    @FXML
    public void calculate_plus (){
        calculate('+');
    }
    @FXML
    public void calculate_minus () {
         calculate('-');
    }
    @FXML
    public void calculate_mult () {
        calculate('*');
    }
    @FXML
    public void calculate_divide () {
        calculate('/');
    }
    public void calculate (char c){
        if (firstnumber.getText().matches(".*\\d.*") && secondnumber.getText().matches(".*\\d.*")){
            try {
                int num1 = Integer.parseInt(firstnumber.getText());
                int num2 = Integer.parseInt(secondnumber.getText());
                result.setTextFill(Color.BLACK);
                switch (c){
                    case '+': result.setText(String.valueOf(num1+num2)); break;
                    case '-': result.setText(String.valueOf(num1-num2)); break;
                    case '*': result.setText(String.valueOf(num1*num2)); break;
                    case '/':
                        if (num2 == 0) {
                            handle_error("Division with 0");
                        } else {
                            result.setText(String.valueOf(num1 / num2));
                        }
                }
            } catch (Exception e){
                handle_error("Invalid numbers");
            }
        } else {
            handle_error("Invalid numbers");
        }
    }

    public void handle_error (String message){
        result.setTextFill(Color.RED);
        result.setText(message);
    }

}
