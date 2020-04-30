/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views.gestionnaire;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXRadioButton;
import com.jfoenix.controls.JFXTextField;
import com.jfoenix.controls.JFXToggleButton;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ToggleGroup;
import javafx.scene.paint.Color;
import alimentation.Gestionnaire;
import alimentation.EntityClasses;

/**
 * FXML Controller class
 *
 * @author jhy
 */
public class AjoutEmployesController implements Initializable {

    
    @FXML
    private JFXTextField nameField;

    @FXML
    private JFXTextField logInField;

    @FXML
    private JFXTextField pwdField;

    @FXML
    private ToggleGroup TypeGestionnaire;
    
    @FXML
    private JFXRadioButton isCashierRadio;

    @FXML
    private JFXRadioButton isGestionnaireRadio;

    @FXML
    private JFXToggleButton StateToggleButton;
    
    @FXML
    private JFXButton validateButton;

    @FXML
    private JFXButton cancelButton;

    @FXML
    void cancel(ActionEvent event) {
        nameField.setText("");
        logInField.setText("");
        pwdField.setText("");
    }

    @FXML
    void changeState(ActionEvent event) {
        if(StateToggleButton.isSelected()) StateToggleButton.setText("Actif");
        else StateToggleButton.setText("Inactif");
    }

    @FXML
    void validate(ActionEvent event) {
        Gestionnaire newUser = new Gestionnaire(
                nameField.getText(),
                logInField.getText(),
                pwdField.getText(),
                (TypeGestionnaire.getSelectedToggle() == isGestionnaireRadio),
                StateToggleButton.isSelected()
        );
        EntityClasses.add(newUser);
        cancel(event);
        System.out.println("Employee Added");
    }
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        this.isCashierRadio.setSelectedColor(Color.valueOf("ffa500"));
        this.isCashierRadio.setSelected(true);
        this.isGestionnaireRadio.setSelectedColor(Color.valueOf("ffa500"));
        StateToggleButton.setSelected(true);
        StateToggleButton.setText("Actif");
    }    
    
}
