package eu.unipv.zanussi.fdi2.httpd.model;

import java.util.ArrayList;
import java.util.List;

public class Book {

    private String category;
    private String title;
    private List<String> authors = new ArrayList<>();
    private String year;
    private String price;

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<String> getAuthors() {
        return authors;
    }

    public void addAuthor(String author) {
        this.authors.add(author);
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("(C: %s, T: %s, A: %s, Y: %s, P: %s)", category, title, authors, year, price);
    }

}
