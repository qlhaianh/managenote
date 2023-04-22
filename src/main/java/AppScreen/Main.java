package AppScreen;

import AppObject.Note;
import javafx.application.Application;
import javafx.css.Style;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.SplitPane;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.TilePane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class Main extends Application {
    public static AnchorPane calendarView;
    public static BorderPane mainPage;
    public static TabPane noteView;
    public static void main(String[] args) {
        launch();
    }


    public void start(Stage stage) throws IOException {
        calendarView = new FXMLLoader(Main.class.getResource("Calendar.fxml")).load();
        noteView = new FXMLLoader(Main.class.getResource("TabNote.fxml")).load();
        mainPage = new FXMLLoader(Main.class.getResource("HomePage.fxml")).load();
        Scene scene = new Scene(mainPage,1280 , 600);
        stage.setTitle("Note App");
        stage.setScene(scene);
        stage.show();
//        SplitPane hehe = new SplitPane();
    }
}



