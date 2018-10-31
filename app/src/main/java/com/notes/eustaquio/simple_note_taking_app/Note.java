package com.notes.eustaquio.simple_note_taking_app;

public class Note {
    private long id = -1;
    private String title = "";
    private String body = "";
    private String createdat = "";
    public Note(long id, String title, String body, String createdat, String updatedat) {
        this.id = id;
        this.title = title;
        this.body = body;
        this.createdat = createdat;
        String updatedat1 = updatedat;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public String getCreatedat() {
        return createdat;
    }

}
