package eu.unipv.zanussi.fdi2.httpd;

import eu.unipv.zanussi.fdi2.httpd.model.Book;
import eu.unipv.zanussi.fdi2.httpd.model.BookStore;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Random;

public class BooksService implements IService {

    public static final String FILE_NAME = ServerConstants.SERVER_ROOT_PATH + "/books02.html";

    private BookStore books;

    /** If true, displays a random book, all books otherwise. */
    private boolean isRandom;

    public BooksService(BookStore books, boolean isRandom) {
        this.books = books;
        this.isRandom = isRandom;
    }

    @Override
    public void sendHTTP(Socket clientSocket, HttpRequest request) throws IOException {
        HttpMessage message = new HttpMessage();
        message.openHttpAnswer(clientSocket, getMime(FILE_NAME));
        copyFile(FILE_NAME, message.getOut());
        message.closeHttpAnswer();
    }

    private void copyFile(String fileName, OutputStreamWriter out) throws IOException {
        BufferedReader fileReader = new BufferedReader(new FileReader(fileName));
        String fileLine = fileReader.readLine();

        // MY METHOD IN MAIN
//        byte[] bytes = Files.readAllBytes(Paths.get(fileName));
//        out.write(bytes);

        while (fileLine != null) {
            if (fileLine.trim().equals("$BOOKS_LIBRARY$")) {
                String content = isRandom ? getSuggestedBook() : generateAllBookTags();
                out.write(content);
            } else
                out.write(fileLine + '\n');

            fileLine = fileReader.readLine();
        }
    }

    private static String getMime(String fileName) {
        String extension = "";

        int i = fileName.lastIndexOf('.');
        if (i > 0)
            extension = fileName.substring(i + 1);

        switch (extension) {
            case "html":
                return "text/html; charset=utf-8";
            case "jpg":
                return "image/jpeg";
            default:
                return "application/octet-stream";
        }
    }

    /** Converts a {@link Book} to HTML. */
    private String generateBookTag(Book book) {
        return String.format("<div class=\"item\">\n" +
                             "  <div>\n" +
                             "    <h2>%s</h2>\n" +
                             "    <b>%s</b><br>\n" +
                             "    Price: $%s<br>\n" +
                             "    Year: %s<br>\n" +
                             "  </div>\n" +
                             "</div>",
                book.getTitle(), book.getAuthors(), book.getPrice(), book.getYear());
    }

    private String generateAllBookTags() {
        String ret = "";
        for (int i = 0; i < books.size(); i++)
            ret += generateBookTag(books.getBook(i));
        return ret;
    }

    /** Retrieves a random book (HTML code) from the library. */
    private String getSuggestedBook() {
        int n = new Random().nextInt(books.size());
        return generateBookTag(books.getBook(n));
    }

}
