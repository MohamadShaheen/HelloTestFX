package ac.il.haifa.cs.sweng.HelloTestFX;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML
    private TextField textField;

    @FXML
    void sayHello() {
        textField.setText("Hello World");
    }

    @FXML
    void initialize() {
        textField.setText("");
    }
}
