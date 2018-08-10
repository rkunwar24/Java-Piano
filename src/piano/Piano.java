/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package piano;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;

import javafx.stage.Stage;

/**
 *
 * @author ADMIN
 */
public class Piano extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        try {
            Button btn = new Button();
            btn.setText("Say 'Piano'");
            btn.setOnAction(new EventHandler<ActionEvent>() {
                
                @Override
                public void handle(ActionEvent event) {
                    System.out.println("Piano");
                }
            });
            
            Parent root=FXMLLoader.load(getClass().getResource("one.fxml"));
            Scene scene = new Scene(root, 700,420);
            
            primaryStage.setTitle("Piano");
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException ex) {
            Logger.getLogger(Piano.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
