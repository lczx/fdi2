package eu.unipv.zanussi.fdi2.httpd;

import eu.unipv.zanussi.fdi2.httpd.model.BookStore;
import eu.unipv.zanussi.fdi2.httpd.xml.LibraryLoader;

public class ServerLauncher {

    public static void main(String[] args) {
        Server server = new Server(ServerConstants.PORT);

        BookStore books = new LibraryLoader(ServerConstants.APPLICATION_PATH + "/books.xml").createLibrary();

        server.addService("/books", new BooksService(books, false));
        server.addService("/random_book", new BooksService(books, true));
        server.launch();
    }

}
