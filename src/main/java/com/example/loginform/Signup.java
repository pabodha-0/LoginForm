package com.example.loginform;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.io.IOException;

public class Signup {
    @FXML
    private Label successText;

    public void onCancelClick() throws IOException {
        Main a = new Main();
        a.changeScene("login.fxml");
    }

    public void onSignupClick() throws IOException {
        successText.setText("Signup success");
    }


}
