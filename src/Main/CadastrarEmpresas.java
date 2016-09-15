/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Rebeca Cecilio Bernardi
 */
public class CadastrarEmpresas extends Application {

    private static Stage stage;

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/View/CadastrarEmpresas.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.setTitle("Cadastrar Empresas");
        stage.show();
        CadastrarEmpresas.stage=stage;
    }

    public static void main(String[] args) {
        launch(args);
    }
     
     public static Stage getStage(){
        return CadastrarEmpresas.stage;
    }
         public void setStage(Stage s){
        CadastrarEmpresas.stage=s;
    } 
}