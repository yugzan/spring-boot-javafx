package com.yugzan;

import org.springframework.stereotype.Component;
import javafx.application.HostServices;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

@Component
public class SimpleUiController {

  private final HostServices hostServices;
  @FXML
  public Button btn;
  @FXML
  public Label label;
  @FXML
  public TextField textfield;
  @FXML
  public VBox root;


  SimpleUiController(HostServices hostServices) {
    this.hostServices = hostServices;
  }


  @FXML
  public void initialize() {
    this.btn.setOnAction(event ->
      {
        this.label.setText(this.textfield.getText());
      });
  }
}
