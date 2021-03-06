/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Main.TelaAdmin;
import Main.TelaCadastroOng;
import Main.TelaPrincipal;
import Main.TelaTabelaOng;
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
 * @author <Leticia e Mylena>
 */
public class TelaAdminController implements Initializable {

    @FXML
    private Button btTPessoa, btTOng, btGDoa, btGDoaM, btVoltar, btFotos;

    public void sair() {
        TelaPrincipal principal = new TelaPrincipal();
        TelaAdmin.getStage().close();
        try {
            principal.start(new Stage());
        } catch (Exception ex) {
            Logger.getLogger(TelaPrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void entrar() {
        TelaTabelaOng tabela = new TelaTabelaOng();
        TelaAdmin.getStage().close();
        try {
            tabela.start(new Stage());
        } catch (Exception ex) {
            Logger.getLogger(TelaPrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {

        btVoltar.setOnKeyPressed((KeyEvent evt) -> { //mouse 
            if (evt.getCode() == KeyCode.ENTER) {
                sair();
            }
        });
        btVoltar.setOnMouseClicked((MouseEvent e) -> {
            sair();
        });
        btTOng.setOnKeyPressed((KeyEvent evt) -> { //mouse 
            if (evt.getCode() == KeyCode.ENTER) {
                entrar();
            }
        });
        btTOng.setOnMouseClicked((MouseEvent e) -> {
            entrar();
        });
    }

}
