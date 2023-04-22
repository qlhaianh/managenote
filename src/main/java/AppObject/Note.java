package AppObject;

import java.util.Date;

public class Note {
    private String note_id;
    private String note_title;
    private String note_body;
    private Date created_at;
    private Date updated_at;
    private boolean liked;

    public Note(String note_title, String note_body) {
        this.note_title = note_title;
        this.note_body =  note_body;
        this.created_at = new Date();
        this.updated_at = new Date();
        this.liked = false;
    }

    public String getNote_id() {
        return note_id;
    }

    public void setNote_id(String note_id) {
        this.note_id = note_id;
    }

    public String getNote_title() {
        return note_title;
    }

    public void setNote_title(String note_title) {
        this.note_title = note_title;
    }

    public String getNote_body() {
        return note_body;
    }

    public void setNote_body(String note_body) {
        this.note_body = note_body;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public Date getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Date updated_at) {
        this.updated_at = updated_at;
    }

    public boolean isLiked() {
        return liked;
    }

    public void setLiked(boolean liked) {
        this.liked = liked;
    }

    @Override
    public String toString() {
        return "Note{" +
                "note_id=" + note_id +
                ", note_title='" + note_title + '\'' +
                ", note_body='" +  note_body + '\'' +
                ", created_at=" +  created_at +
                ", updated_at=" +  updated_at +
                ", liked =" + liked +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Note note = (Note) obj;

        if (note_id != note.note_id) return false;
        if (!note_title.equals(note.note_title)) return false;
        if (!note_body.equals(note.note_body)) return false;
        return false;
    }

}
