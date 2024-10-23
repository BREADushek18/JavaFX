package org.example.javafx;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

public class HelloController {
    @FXML
    private TextField inputField;
    @FXML
    private TextField outputField;
    @FXML
    private Button switchButton;

    @FXML
    private Label widget1;
    @FXML
    private TextField widget2;
    @FXML
    private Button widget3;

    @FXML
    private CheckBox checkBox1;
    @FXML
    private CheckBox checkBox2;
    @FXML
    private CheckBox checkBox3;

    @FXML
    private StackPane mainPane;
    @FXML
    private VBox wordSwitcherPane;
    @FXML
    private VBox widgetsPane;

    private boolean isArrowRight = true;

    @FXML
    protected void onSwitchButtonClick() {
        String temp = inputField.getText();
        inputField.setText(outputField.getText());
        outputField.setText(temp);

        if (isArrowRight) {
            switchButton.setText("←");
        } else {
            switchButton.setText("→");
        }
        isArrowRight = !isArrowRight;
    }

    @FXML
    protected void toggleWidget1() {
        widget1.setVisible(checkBox1.isSelected());
    }

    @FXML
    protected void toggleWidget2() {
        widget2.setVisible(checkBox2.isSelected());
    }

    @FXML
    protected void toggleWidget3() {
        widget3.setVisible(checkBox3.isSelected());
    }

    @FXML
    protected void showWordSwitcher() {
        wordSwitcherPane.setVisible(true);
        widgetsPane.setVisible(false);
    }

    @FXML
    protected void showWidgets() {
        wordSwitcherPane.setVisible(false);
        widgetsPane.setVisible(true);
    }
}
