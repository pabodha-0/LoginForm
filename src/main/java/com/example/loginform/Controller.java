package com.example.loginform;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.io.IOException;

public class Controller {
    @FXML
    private Label welcomeText;

    @FXML
    private Button userSignup;

    public void onSignupClick() throws IOException {
        Main a = new Main();
        a.changeScene("signup.fxml");
    }

}