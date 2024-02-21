package com.example.test1csd214nawaz;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class HelloController {
    public TextField name;
    public PasswordField pwd;
    public Label message;

    @FXML
    private Label welcomeText;

    Integer x=5;

    @FXML
    protected void onHelloButtonClick() {


        String uname= name.getText();

        String passwd= pwd.getText();

        if(uname.equals("")&&passwd.equals("")){

            message.setText("Please Provide Username or Password.");

        }else {


            if(uname.equals("nawaz")&&passwd.equals("123")){

                if(x<=0){
                    message.setText("Locked!!");

                }else{
                    message.setText("Success!!!");
                    x=5;
                }


            }else if(uname.equals("nawaz")){

                x=x-1;

                if(x<=0){
                    message.setText("Locked!!");

                }else{
                    message.setText("You have"+x+"attempst left!!!");
                }


            }else{

                message.setText("Invalid Username or password!!!");
            }
        }


    }
}