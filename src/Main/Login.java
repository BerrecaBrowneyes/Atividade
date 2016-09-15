/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @authorRebeca Cecilio Bernardi
 */
public class Login extends Application {
     private static Stage Stage;
    private static Stage stage;

       
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/View/Login.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.setTitle("Login");
        stage.show();
        Login.stage = stage;
        
    }


    public static void main(String[] args) {
        launch(args);
    }

    public static Stage getStage(){
        return Login.stage;
    }
    public void setStage(Stage s){
        Login.stage = s;
    }
    
}