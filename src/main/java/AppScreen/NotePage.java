package AppScreen;

import AppObject.Note;

import java.util.ArrayList;
import java.util.List;

class NotePage {
    public static List<Note> noteList = new ArrayList<>();
    public NotePage() {
        Note note1 = new Note();
        Note note2 = new Note();
        note1.setNote_title("ghi chu 1");
        note2.setNote_title("ghi chu 2");
        noteList.add(note1);
        noteList.add(note2);
    }
}
