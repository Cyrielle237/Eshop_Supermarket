/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views.gestionnaire;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TableView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import views.LogInController;

/**
 * FXML Controller class
 *
 * @author jhy
 */
public class MainSceneController implements Initializable {

    /**
     * Initializes the controller class.
     */
     @FXML
    private MenuButton GestionStock;

    @FXML
    private MenuItem GestionStockAjout;

    @FXML
    private MenuItem GestionStockRetrait;

    @FXML
    private MenuItem GestionStockConsultation;

    @FXML
    private MenuButton Employes;

    @FXML
    private MenuItem EmployesAjout;

    @FXML
    private MenuItem EmployesModifier;

    @FXML
    private MenuButton Historiques;

    @FXML
    private MenuItem HistoriquesVentes;

    @FXML
    private MenuItem HistoriquesAchats;

    @FXML
    private MenuItem HistoriquesStatistiques;

    @FXML
    private MenuButton Compte;

    @FXML
    private MenuItem CompteProfile;

    @FXML
    private MenuItem CompteDeconnexion;

    @FXML
    private StackPane mainPane;

    @FXML
    void CompteDeconnexion(ActionEvent event){
         try {
             LogInController.user = null;
             Parent parent = FXMLLoader.load(getClass().getResource("../LogIn.fxml"));
             Scene scene = new Scene(parent);
             Stage window = (Stage)((Node)Compte).getScene().getWindow();
             window.setScene(scene);
             window.show();
         } catch (IOException ex) {
             System.out.println(ex.getMessage());
         }
    }

    @FXML
    void CompteProfile(ActionEvent event) {
        try{
            GridPane grid = FXMLLoader.load(getClass().getResource("Profile.fxml"));
            mainPane.getChildren().clear();
            mainPane.getChildren().add(grid);
        }catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }

    @FXML
    void EmployesAjout(ActionEvent event) throws IOException {
        Pane newLoadedPane = FXMLLoader.load(getClass().getResource("AjoutEmployes.fxml"));
        mainPane.getChildren().clear();
        mainPane.getChildren().add(newLoadedPane); 
        
        
    }

    @FXML
    void  EmployesModifier(ActionEvent event){
         try {
             TableView newLoaded = FXMLLoader.load(getClass().getResource("Employes.fxml"));
             mainPane.getChildren().clear();
             mainPane.getChildren().add(newLoaded);
         } catch (IOException ex) {
             System.out.println(ex.getMessage());
         }
    }

    @FXML
    void GestionStockAjout(ActionEvent event) {

    }

    @FXML
    void GestionStockConsultation(ActionEvent event) {

    }

    @FXML
    void GestionStockRetrait(ActionEvent event) {

    }

    @FXML
    void HistoriquesAchats(ActionEvent event) {

    }

    @FXML
    void HistoriquesStatistiques(ActionEvent event) {

    }

    @FXML
    void HistoriquesVentes(ActionEvent event) {

    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
