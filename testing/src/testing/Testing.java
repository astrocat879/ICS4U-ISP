import javafx.animation.*;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.*;
import javafx.scene.shape.*;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Testing extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Button front = new Button("asdf");

        ScaleTransition stHideFront = new ScaleTransition(Duration.millis(1500), front);
        stHideFront.setFromX(1);
        stHideFront.setToX(0);

        Button back = new Button("asdf");
        back.setScaleX(0);

        ScaleTransition stShowBack = new ScaleTransition(Duration.millis(1500), back);
        stShowBack.setFromX(0);
        stShowBack.setToX(1);

        stHideFront.setOnFinished(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent t) {
                stShowBack.play();
            }
        });

        StackPane root = new StackPane();
        root.getChildren().addAll(front, back);
        Scene scene = new Scene(root, 300, 250);
        primaryStage.setScene(scene);

        primaryStage.show();
        stHideFront.play();
    }

    public static void main(String[] args) {
        launch();
    }
}