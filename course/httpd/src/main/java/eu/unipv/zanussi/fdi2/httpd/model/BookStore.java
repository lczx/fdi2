package eu.unipv.zanussi.fdi2.httpd.model;

import java.util.ArrayList;
import java.util.List;

public class BookStore {

    private List<Book> books = new ArrayList<>();

    public List<Book> getBooks() {
        return books;
    }

    public Book getBook(int i) {
        return books.get(i);
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public int size() {
        return books.size();
    }

    @Override
    public String toString() {
        String ret = "[";
        for (Book book : books)
            ret += book + ", ";
        return ret + ']';
    }

}
