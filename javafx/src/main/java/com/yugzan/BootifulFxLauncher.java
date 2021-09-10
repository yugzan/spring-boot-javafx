package com.yugzan;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import javafx.application.Application;

@SpringBootApplication
public class BootifulFxLauncher {

  public static void main(String[] args) {
    Application.launch(JavafxApplication.class, args);
  }
}
