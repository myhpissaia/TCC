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
import static javafx.application.Application.launch;

/**
 *
 * @author <Leticia e Mylena>
 */
public class TelaCadastroOng  extends Application { 
    private static Stage stage;
    
  

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/View/TelaCadastroOng.fxml"));
        
        Scene scene = new Scene(root);
        stage.setTitle("ONG");
        stage.setScene(scene);
        stage.show();
        TelaCadastroOng.stage = stage;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
        public static Stage getStage() {
        return TelaCadastroOng.stage;
    }
    public void setStage(Stage s) {
        TelaCadastroOng.stage = s;
    }
}

