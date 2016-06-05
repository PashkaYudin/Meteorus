package com.example.broso.meteor;

/**
 * Created by broso on 10.04.2016.
 */
public class ListItem {
    private String title, genre, year;
    private int icon;
//    private int icon;
    public ListItem() {
    }

    public ListItem(String title, String genre, String year, int icon) {
        this.title = title;
        this.genre = genre;
        this.year = year;
        this.icon = icon;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String name) {
        this.title = name;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}