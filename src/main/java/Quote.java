package models;

public class Quote {
    private int id;
    private String content;
    private models.Author author;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public models.Author getAuthor() {
        return author;
    }

    public void setAuthor(models.Author author) {
        this.author = author;
    }

    public Quote() {
    }

    public Quote(String content, models.Author author) {
        this.content = content;
        this.author = author;
    }
}
