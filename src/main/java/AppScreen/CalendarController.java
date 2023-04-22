package AppScreen;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.Border;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

import java.net.URL;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class CalendarController implements Initializable {
    private ZonedDateTime today;
    private ZonedDateTime dateFocus;
    private List<Button> listDay = new ArrayList<>();
    private List<HBox> week = new ArrayList<>();
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        today = ZonedDateTime.now();
        dateFocus = ZonedDateTime.now();
        year.setText(Integer.toString(today.getYear()));
        month.setText(today.getMonth().toString());
        for(int i = 0; i < 6; i++) {
            week.add(new HBox());
            week.get(i).setPrefWidth(600);
            week.get(i).setPrefHeight(55);
            week.get(i).setAlignment(Pos.CENTER);
            calendar.getChildren().add(week.get(i));
        }
        for(int i = 0; i < 42; i++) {
            listDay.add(new Button());
            listDay.get(i).setPrefWidth(80);
            listDay.get(i).setPrefHeight(week.get((int) i/7).getPrefHeight());
            listDay.get(i).setStyle("-fx-background-color: white");
            week.get((int) i/7).getChildren().add(listDay.get(i));
        }
        int dayOfMonth = today.getDayOfMonth();
        int dayOfWeek = today.getDayOfWeek().getValue();
        int todayincalendar = ((int) dayOfMonth/7) * 7 + dayOfWeek;
        listDay.get(todayincalendar).setText("today");
        listDay.get(todayincalendar).setStyle("-fx-background-color: red ");
//        for(int i = dayOfMonth - 1; i >= 1; i--) {
//            listDay.get(todayincalendar - i).setText(Integer.toString(dayOfMonth - i));
//        }
//        for(int i = 1; i <= today.getMonth().length(true) - dayOfMonth; i++) {
//            listDay.get(todayincalendar + i).setText(Integer.toString(dayOfMonth + i));
//        }
        calendar.setAlignment(Pos.CENTER);
    }

    @FXML
    private Text year;
    @FXML
    private Text month;
    @FXML
    private VBox calendar;
}
