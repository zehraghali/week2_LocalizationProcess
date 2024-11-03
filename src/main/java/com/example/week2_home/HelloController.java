package com.example.week2_home;

import java.text.SimpleDateFormat;
import java.util.Date;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import java.util.Locale;
import java.util.ResourceBundle;

public class HelloController {

    @FXML
    private Label welcomeText;

    @FXML
    private Button button1;

    @FXML
    private Button button2;

    @FXML
    private Button button3;

    @FXML
    private Label nameTimeLabel;

    @FXML
    public void initialize() {
        loadView(Locale.ENGLISH);
    }

    public void loadView(Locale locale) {
        ResourceBundle bundle = ResourceBundle.getBundle("bundle", locale);

        button1.setText(bundle.getString("button1.text"));
        button2.setText(bundle.getString("button2.text"));
        button3.setText(bundle.getString("button3.text"));
        welcomeText.setText(bundle.getString("welcome.text"));

        // Aseta nimesi ja nykyinen aika
        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
        String currentTime = formatter.format(new Date());
        nameTimeLabel.setText("Zehra: " + currentTime);
    }

    @FXML
    public void handleButton1Action() {
        loadView(Locale.ENGLISH);
    }

    @FXML
    public void handleButton2Action() {
        loadView(new Locale("fa"));
    }

    @FXML
    public void handleButton3Action() {
        loadView(new Locale("ja"));
    }
}
