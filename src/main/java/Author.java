package models;

import java.util.ArrayList;

public class Author {
    private int id;
    private String name;

    private ArrayList<models.Quote> quotes;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<models.Quote> getQuotes() {
        return quotes;
    }

    public void setQuotes(ArrayList<models.Quote> quotes) {
        this.quotes = quotes;
    }

    public Author() {
    }

    public Author(String name) {
        this.name = name;
    }


}
