/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Main.CadastrarPessoas;
import Model.BD;
import Model.Pessoas;
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
public class CadastrarPessoasController implements Initializable {
@FXML private Button cancelarpes;
@FXML private Button cadastrarpes;
@FXML private TextField nomepes;
@FXML private TextField snomepes;
@FXML private TextField rgpes;
@FXML private TextField cpfpes;
@FXML private TextField numpes;
@FXML private TextField cidpes;
@FXML private TextField estpes;
@FXML private TextField endpes;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        cadastrarpes.setOnMouseClicked((MouseEvent e)->{
        try{
            Pessoas pes1= new Pessoas();
            pes1.setCidade(cidpes.getText());
            pes1.setCpf(cpfpes.getText());
            pes1.setEndereco(endpes.getText());
            pes1.setEstado(estpes.getText());
            pes1.setNum(numpes.getText());
            pes1.setSobrenome(snomepes.getText());
            pes1.setRg(rgpes.getText());
            pes1.setNome(nomepes.getText());
            BD.getListapessoas().add(pes1);
            CadastrarPessoas.getStage().close();
            Alert al = new Alert(Alert.AlertType.CONFIRMATION);
            al.setHeaderText("Cadastro confirmado!");
            al.show();
            
        }catch (Exception ee){
            ee.getStackTrace();
        }
            
        });
        
        cancelarpes.setOnMouseClicked((MouseEvent e)->{
          CadastrarPessoas.getStage().close();
            
        });
         cancelarpes.setOnKeyPressed((KeyEvent evt)->{
             if(evt.getCode()== KeyCode.ENTER){
                 CadastrarPessoas.getStage().close();
             }
         });
         
         cadastrarpes.setOnKeyPressed((KeyEvent evt)->{
             if(evt.getCode()== KeyCode.ENTER){
                  try{
            Pessoas pes1= new Pessoas();
            pes1.setCidade(cidpes.getText());
            pes1.setCpf(cpfpes.getText());
            pes1.setEndereco(endpes.getText());
            pes1.setEstado(estpes.getText());
            pes1.setNum(numpes.getText());
            pes1.setSobrenome(snomepes.getText());
            pes1.setRg(rgpes.getText());
            pes1.setNome(nomepes.getText());
            BD.getListapessoas().add(pes1);
            CadastrarPessoas.getStage().close();
            Alert al = new Alert(Alert.AlertType.CONFIRMATION);
            al.setHeaderText("Cadastro confirmado!");
            al.show();
            
        }catch (Exception ee){
            ee.getStackTrace();
        }
             }
    });    
                 
                 }
}

