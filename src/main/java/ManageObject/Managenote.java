package ManageObject;

import AppObject.Note;

import java.util.ArrayList;
import java.util.Scanner;

public class Managenote {
    private static ArrayList<Note> ListAllNote = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("1. Add note");
            System.out.println("2. Edit note");
            System.out.println("3. Delete note");
            System.out.println("4. Show all notes");
            System.out.println("5. Exit");
            System.out.println("Enter your choice:");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addNote();
                    break;
                case 2:
                    editNote();
                    break;
                case 3:
                    deleteNote();
                    break;
                case 4:
                    showNotes();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
            }
        }
    }

    private static void addNote() {
        System.out.print("Enter title:");
        String note_title = scanner.nextLine();

        System.out.print("Enter body:");
        String note_body = scanner.nextLine();

        Note note = new Note(note_title, note_body);
        ListAllNote.add(note);
        System.out.println("Note added successfully!");
    }

    private static void editNote() {
        if (ListAllNote.isEmpty()) {
            System.out.println("No notes found!");
            return;
        }
        showNotes();

        System.out.println("Enter note ID:");
        int note_id = scanner.nextInt();
        scanner.nextLine();

        if (note_id < 1 || note_id > ListAllNote.size()) {
            System.out.println("Invalid note ID");
            return;
        }

        Note note = ListAllNote.get(note_id - 1);

        System.out.println("Enter new title:");
        String title = scanner.nextLine();

        System.out.println("Enter new body:");
        String body = scanner.nextLine();

        note.setNote_title(title);
        note.setNote_body(body);
        System.out.print("Is the note liked? (true/false): ");
        boolean liked = scanner.nextBoolean();
        note.setLiked(liked);

        System.out.println("Note updated successfully");
    }

    private static void deleteNote() {
        System.out.println("Enter note ID:");
        int note_id = scanner.nextInt();
        scanner.nextLine();

        if (note_id < 1 || note_id > ListAllNote.size()) {
            System.out.println("Invalid note ID");
            return;
        }

        ListAllNote.remove(note_id - 1);
        System.out.println("Note deleted successfully");
    }

    private static void showNotes() {
        if (ListAllNote.size() == 0) {
            System.out.println("No notes found");
            return;
        }

        for (int i = 0; i < ListAllNote.size(); i++) {
            System.out.println("Note ID: " + (i + 1));
            System.out.println("Title: " + ListAllNote.get(i).getNote_title());
            System.out.println("Body: " + ListAllNote.get(i).getNote_body());
            System.out.println("Created at: " + ListAllNote.get(i).getCreated_at());
            System.out.println("Updated at: " + ListAllNote.get(i).getUpdated_at());
            System.out.println("liked: " + ListAllNote.get(i).isLiked());
            System.out.println();
        }
    }
}

