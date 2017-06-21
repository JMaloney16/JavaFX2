import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.stage.WindowEvent;

public class Test {
    public static void main(String[] args) {
        launchFX();
    }

    private static void launchFX() {
        new JFXPanel();
        Platform.runLater(() -> intialiseGUI());
    }

    private static void intialiseGUI() {
        Stage stage = new Stage();
        stage.setTitle("Hello World!");
        stage.setResizable(false);
        Pane p = new Pane();
        stage.setScene(new Scene(p));
        stage.setWidth(1000);
        stage.setHeight(1000);
        stage.setOnCloseRequest((WindowEvent we) -> terminate());
        stage.show();
    }

    private static void terminate() {

    }
}