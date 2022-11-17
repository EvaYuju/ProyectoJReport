package com.main.controller;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Clase que inicia la ejecución de la aplicación
 */
public class CuentaBater extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(CuentaBater.class.getResource("ViewVisor.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Aplicación cuentas bancarias");
        stage.setScene(scene);
        stage.show();
    }

    /**
     * Método principal del programa
     * @param args argumentos del programa
     */
    public static void main(String[] args) {
        launch();
    }
}