/*
 * Ronald You and Justin Zhu and Matthew Li
 * Mrs Krasteva
 * Due: June 15, 2020
 * Achievement class to hold list of Achievements
 */
package isp;

import java.util.*;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.image.Image;  
import javafx.scene.image.ImageView; 
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
/**
 *Revision History:
 *  - May 25th, 2020: Created by Justin Zhu
 *  - May 27th, 2020: Updated by Justin Zhu
 * 
 */
public class ISP extends Application {
    
    static Scene s0, s1, s2;
    public static ArrayList<Event> TutEvents = new ArrayList<Event>();
    @Override
    public void start(Stage primaryStage) throws Exception{
        TutorialEvents.generateEvents();
        SelectLevel.run(primaryStage);
        tutorial.run(primaryStage);
        MainMenu.run(primaryStage);
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
