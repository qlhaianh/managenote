package AppScreen;

import AppObject.Event;
import AppObject.Note;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.SplitPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.scene.text.Text;

import java.net.URL;
import java.nio.file.attribute.UserPrincipalLookupService;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class MainController implements Initializable {
    @FXML
    private Button homeButton;
    @FXML
    private Button calendarButton;
    @FXML
    private Pane content;
    @FXML
    private TilePane danhsach;
    @FXML
    private SplitPane page;
    @FXML
    private TextField boxSearch;
    public static List<Note> noteList = new ArrayList<>();
    public static List<Event> eventList = new ArrayList<>();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        for(int i = 0; i < 3; i++) {
                Note note = new Note();
                note.setNote_title("ho ho ho" + i);
                noteList.add(note);
            danhsach.getChildren().add(new Button(noteList.get(i).getNote_title()));
        }
    }
    @FXML public void viewCalendar() {
        content.getChildren().removeAll();
        content.getChildren().setAll(Main.calendarView);
    }
    @FXML
    public void viewNote() {
        content.getChildren().removeAll();
        content.getChildren().setAll(Main.noteView);
    }
    @FXML
    public void thunho() {
        page.setDividerPositions(0);

    }
    @FXML
    public void phongto() {
        page.setDividerPositions(0.1);
    }
}