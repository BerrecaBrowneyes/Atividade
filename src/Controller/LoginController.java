/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Main.Login;
import Main.Principal;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;



/**
 *
 * @author Rebeca Cecilio Bernardi
 */
public class LoginController implements Initializable {
    

    @FXML private Label us;
    @FXML private Label sen;
    @FXML private Button entrarlog;
    @FXML private Button sairlog;
    @FXML private TextField usuario;
    @FXML private PasswordField senha;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        entrarlog.setOnMouseClicked((MouseEvent e) ->{
            if(usuario.getText().equals("user")&&senha.getText().equals("user123")){
                Principal principal = new Principal();
                try{
                    principal.start(new Stage());
                }catch (Exception ex) {
                    Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
                }
                Login.getStage().close();
            }else{
                Alert erro = new Alert(Alert.AlertType.ERROR);
                erro.setHeaderText("Usuario e/ou senha invalidos! "
                          + "Tente novamente");
                erro.show();
            }
        });
               sairlog.setOnMouseClicked((MouseEvent e)->{
                   Login.getStage().close();
               });
        entrarlog.setOnKeyPressed((KeyEvent evt)->{
             if(evt.getCode()== KeyCode.ENTER){
                if(usuario.getText().equals("user")&&senha.getText().equals("user123")){
                Principal principal = new Principal();
                try{
                    principal.start(new Stage());
                }catch (Exception ex) {
                    Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
                }
                Login.getStage().close();
            }else{
                Alert erro = new Alert(Alert.AlertType.ERROR);
                erro.setHeaderText("Usuario e/ou senha invalidos! "
                          + "Tente novamente");
                erro.show();
            }   
             }
    });  
        sairlog.setOnKeyPressed((KeyEvent evt)->{
             if(evt.getCode()== KeyCode.ENTER){
                  Login.getStage().close();
             }


});
        // bc
        
        senha.setOnKeyPressed((KeyEvent evt)->{
             if(evt.getCode()== KeyCode.ENTER){
                if(usuario.getText().equals("user")&&senha.getText().equals("user123")){
                Principal principal = new Principal();
                try{
                    principal.start(new Stage());
                }catch (Exception ex) {
                    Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
                }
                Login.getStage().close();
            }else{
                Alert erro = new Alert(Alert.AlertType.ERROR);
                erro.setHeaderText("Usuario e/ou senha invalidos! "
                          + "Tente novamente");
                erro.show();
            }   
             }
    });  
}
}
