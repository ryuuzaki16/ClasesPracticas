/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ni.edu.uni.fcys.programacion2.conversionfx.controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import ni.edu.uni.fcys.programacion2.conversionfx.App;

/**
 * FXML Controller class
 *
 * @author Sistemas-05
 */
public class MainFXMLController implements Initializable {

    @FXML
    public Button btnTemperature;

    @FXML
    public Button btnCurrency;

    @FXML
    public VBox vboxCenter;

    @FXML
    public ComboBox cmbFrom;
    @FXML
    public ComboBox cmbTo;
    @FXML
    public TextField txtValue;
    @FXML
    public TextField txtResult;
    @FXML
    public Button btnCompute;
    @FXML
    public Button btnClean;

    public ObservableList<String> items;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        items = FXCollections.observableArrayList("Cordobas", "Dolares", "Euros");
        cmbFrom.setItems(items);
        cmbFrom.getItems().add("Cordobas");
        cmbFrom.getItems().add("Dolar");
        cmbFrom.getItems().add("Euro");
    }

    @FXML
    public void btnTemperatureAction() {
        try {

            Node node = App.loadFXML("TemperatureFXML");
            vboxCenter.getChildren().clear();
            vboxCenter.getChildren().add(node);

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    @FXML
    public void btnCurrencyAction() {
        try {

            Node node = App.loadFXML("CurrencyFXML");
            vboxCenter.getChildren().clear();
            vboxCenter.getChildren().add(node);

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

}
