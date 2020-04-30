/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views.gestionnaire;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import alimentation.Gestionnaire;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TableCell;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.util.Callback;
/**
 * FXML Controller class
 *
 * @author jhy
 */
public class EmployesController implements Initializable {
    
    @FXML
    private TableView<Gestionnaire> table;

    @FXML
    private TableColumn<Gestionnaire,String> nameCol;

    @FXML
    private TableColumn<Gestionnaire, String> userCol;

    @FXML
    private TableColumn<Gestionnaire, String> pwdCol;

    @FXML
    private TableColumn<Gestionnaire,String> typeCol;

    @FXML
    private TableColumn<Gestionnaire, String> activeCol;

    @FXML
    private TableColumn<Gestionnaire,Void> actionCol;
    
    private void setColumns(){
        nameCol.setCellValueFactory(new PropertyValueFactory<>("nomGest"));
        userCol.setCellValueFactory(new PropertyValueFactory<>("login"));
        pwdCol.setCellValueFactory(new PropertyValueFactory<>("pwd"));
        
        Callback<TableColumn<Gestionnaire,String>,TableCell<Gestionnaire,String>> cellType = new Callback(){
            @Override
            public Object call(Object param) {
                return new TableCell<Gestionnaire,String>(){
                    @Override
                    public void updateItem(String item,boolean empty){
                        super.updateItem(item, empty);
                        if(empty){
                            setText(null);
                        }else{
                            Gestionnaire gest = getTableView().getItems().get(getIndex());
                            setText(gest.getType());
                        }
                    }
                };
            }
            
        };
        
        Callback<TableColumn<Gestionnaire,String>,TableCell<Gestionnaire,String>> cellActif = new Callback(){
            @Override
            public Object call(Object param) {
                return new TableCell<Gestionnaire,String>(){
                    @Override
                    public void updateItem(String item,boolean empty){
                        super.updateItem(item, empty);
                        if(empty){
                            setText(null);
                        }else{
                            Gestionnaire gest = getTableView().getItems().get(getIndex());
                            if(gest.isActif()) setText("Actif");
                            else setText("Inactif");
                        }
                    }
                };
            }
            
        };
        
        Callback<TableColumn<Gestionnaire,Void>,TableCell<Gestionnaire,Void>> cellAction = new Callback() {
            @Override
            public TableCell<Gestionnaire,Void> call(Object param) {
                final TableCell<Gestionnaire, Void> cell = new TableCell<Gestionnaire, Void>() {

                    private Button btn = new Button();
                    
                    
                    {
                        btn.getStyleClass().add("activation-button");
                        btn.setOnAction((ActionEvent event) -> {
                            Gestionnaire gest = getTableView().getItems().get(getIndex());
                            gest.toggleActivate();
                            setData();
                        });
                    }
                    
                    @Override
                    public void updateItem(Void item, boolean empty) {
                        super.updateItem(item, empty);
                        if (empty) {
                            setGraphic(null);
                        } else {
                            Gestionnaire gest = getTableView().getItems().get(getIndex());
                            if(gest.isActif()) btn.setText("Desactiver");
                            else btn.setText("Activer");
                            setGraphic(btn);
                        }
                    }
                    
                };
                return cell;
            }
        };
        actionCol.setCellFactory(cellAction);
        typeCol.setCellFactory(cellType);
        activeCol.setCellFactory(cellActif);
        
    }
    
    private void setData(){
        ObservableList data = FXCollections.observableList(Gestionnaire.getGestionnaires());
        table.getItems().clear();
        table.setItems(data);
    }
    /**
     * Initializes the controller class.
     */
    @FXML
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        setColumns();
        setData();
    }
    
    
}
