/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Main.CadastrarEmpresas;
import Model.BD;
import Model.Empresas;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author Rebeca Cecilio Bernardi
 */
public class CadastrarEmpresasController implements Initializable {
  
    @FXML private Button cadastroemp;
    @FXML private Button cancelaremp;
    @FXML private TextField nomemp;
    @FXML private TextField cnpjemp;
    @FXML private TextField cpfemp;
    @FXML private TextField endemp;
    @FXML private TextField numemp;
    @FXML private TextField cidemp;          
    @FXML private TextField estemp;
         //não sei o que to fazendo
    @Override
    public void initialize(URL url, ResourceBundle rb) {
      cancelaremp.setOnMouseClicked((MouseEvent e)->{
            CadastrarEmpresas.getStage().close();
        });
      cadastroemp.setOnMouseClicked((MouseEvent e)->{
          try{
              Empresas emp1 = new Empresas();
              emp1.setNome(nomemp.getText());
              emp1.setCnpj(cnpjemp.getText());
              emp1.setCpf(cpfemp.getText());
              emp1.setCidade(cidemp.getText());
              emp1.setEndereco(endemp.getText());
              emp1.setEstado(estemp.getText());
              emp1.setNum(numemp.getText());
              BD.getListaempresas().add(emp1);
            CadastrarEmpresas.getStage().close();
            Alert alt = new Alert(Alert.AlertType.CONFIRMATION);
            alt.setHeaderText("Cadastro confirmado!");
            alt.show();
            CadastrarEmpresas.getStage().close();   
              
              
          }catch (Exception ee){
            ee.getStackTrace();
        }
      });
               cadastroemp.setOnKeyPressed((KeyEvent evt)->{
             if(evt.getCode()== KeyCode.ENTER){
              try{
              Empresas emp1 = new Empresas();
              emp1.setNome(nomemp.getText());
              emp1.setCnpj(cnpjemp.getText());
              emp1.setCpf(cpfemp.getText());
              emp1.setCidade(cidemp.getText());
              emp1.setEndereco(endemp.getText());
              emp1.setEstado(estemp.getText());
              emp1.setNum(numemp.getText());
              BD.getListaempresas().add(emp1);
            CadastrarEmpresas.getStage().close();
            Alert alt = new Alert(Alert.AlertType.CONFIRMATION);
            alt.setHeaderText("Cadastro confirmado!");
            alt.show();
            CadastrarEmpresas.getStage().close();   
              
              
          }catch (Exception ee){
            ee.getStackTrace();
        }
             
             }
               });
                 cancelaremp.setOnKeyPressed((KeyEvent evt)->{
             if(evt.getCode()== KeyCode.ENTER){
              CadastrarEmpresas.getStage().close();
             }
             });
               
    }    
    
    }    
    

