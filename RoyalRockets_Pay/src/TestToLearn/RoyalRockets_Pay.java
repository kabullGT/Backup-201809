/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestToLearn;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Infax
 */
public class RoyalRockets_Pay extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("RoyalRocketsPayFXML.fxml"));
        
        Scene scene = new Scene(root, 360, 640);
        
        Parent cashierUnlock = FXMLLoader.load(getClass().getResource("PaymentType.fxml"));
        Scene starterScene = new Scene(cashierUnlock);
        
        stage.setTitle("RoyalRockets Welcome");
        stage.setScene(starterScene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
