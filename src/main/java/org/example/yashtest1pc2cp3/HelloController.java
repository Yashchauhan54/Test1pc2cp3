package org.example.yashtest1pc2cp3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    public TextField one;
    public TextField two;

    @FXML
    private Label welcomeText;
    Integer x =5;


    public void onHelloButtonClick(ActionEvent actionEvent) {
        String a = one.getText();
        String b = two.getText();




        if (isFullname(a)){
            welcomeText.setText("login Success");
        }else {
            welcomeText.setText("invalid Username.Please insert Alphabet only");
        }

        if (isNumberic(b)){
            welcomeText.setText("login Success");
        }else {
            welcomeText.setText("invalid password. Use only Number");
        }




        if (isFullname(a) && isNumberic(b)) {
            if (x<=0){
                welcomeText.setText("Your Account is locked");


            }
            else {
                welcomeText.setText("Login Successfull");
                x=5;

            }



        } else if (isFullname(a)) {

            welcomeText.setText("invalid username or password. You have "+x+"Attempt left");
            x--;

            if (x<=0){
                welcomeText.setText("Your Account is locked");
            }


        } else {

            welcomeText.setText("invalid username or password");

        }







    }


    public static boolean isFullname(String str) {
        String expression = "^[Yash\\s]+";
        return str.matches(expression);
    }
    public static boolean isNumberic(String str) {
        String expression = "^[456\\s]+";
        return str.matches(expression);
    }

}
