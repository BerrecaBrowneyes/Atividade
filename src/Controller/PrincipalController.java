/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.BD;
import Main.CadastrarEmpresas;
import Main.CadastrarPessoas;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Rebeca Cecilio Bernardi
 */
public class PrincipalController implements Initializable {

@FXML private Button mcp;
@FXML private Button mce;
@FXML private Button mle;
@FXML private Button mlp;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        mcp.setOnMouseClicked((MouseEvent e)->{
        CadastrarPessoas cadastrarPessoas = new CadastrarPessoas();
        try {
            cadastrarPessoas.start(new Stage());
        }catch (Exception ex) {
            Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
        });
    
  
  mce.setOnMouseClicked((MouseEvent e)->{
       CadastrarEmpresas cadastrarEmpresas = new CadastrarEmpresas(); 
       
      try {
          cadastrarEmpresas.start(new Stage());
      } catch (Exception ex) {
          Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE, null, ex);
      }
       
    });
        mle.setOnMouseClicked((MouseEvent e)->{
          for(int x =0; x<BD.getListaempresas().size(); x++){
              BD.getListaempresas().get(x).MostrarEmpresa();
          }  
        });
    
        mlp.setOnMouseClicked((MouseEvent e)->{
         for(int x=0; x<BD.getListapessoas().size(); x++){
              BD.getListapessoas().get(x).Mostrarpessoas();
          }  
        });
  mcp.setOnKeyPressed((KeyEvent evt)->{
             if(evt.getCode()== KeyCode.ENTER){
CadastrarPessoas cadastrarPessoas = new CadastrarPessoas();
        try {
            cadastrarPessoas.start(new Stage());
        }catch (Exception ex) {
            Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    
    
});
  
  
  mce.setOnKeyPressed((KeyEvent evt)->{
             if(evt.getCode()== KeyCode.ENTER){
                 CadastrarEmpresas cadastrarEmpresas = new CadastrarEmpresas(); 
       
      try {
          cadastrarEmpresas.start(new Stage());
      } catch (Exception ex) {
          Logger.getLogger(PrincipalController.class.getName()).log(Level.SEVERE, null, ex);
      }
             }

    });
  
    mle.setOnKeyPressed((KeyEvent evt)->{
             if(evt.getCode()== KeyCode.ENTER){
            for(int x =0; x<BD.getListaempresas().size(); x++){
              BD.getListaempresas().get(x).MostrarEmpresa();
          }       
                 
             }
    });
   mlp.setOnKeyPressed((KeyEvent evt)->{
             if(evt.getCode()== KeyCode.ENTER){
                for(int x=0; x<BD.getListapessoas().size(); x++){
              BD.getListapessoas().get(x).Mostrarpessoas();
          }   
             }
   });
    }
    
}
