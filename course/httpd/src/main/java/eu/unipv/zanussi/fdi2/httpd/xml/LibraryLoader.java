package eu.unipv.zanussi.fdi2.httpd.xml;

import eu.unipv.zanussi.fdi2.httpd.model.Book;
import eu.unipv.zanussi.fdi2.httpd.model.BookStore;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class LibraryLoader {

    private File xmlFile;

    public LibraryLoader(String xmlFilePath) {
        this(new File(xmlFilePath));
    }

    public LibraryLoader(File xmlFile) {
        this.xmlFile = xmlFile;
    }

    public BookStore createLibrary() {
        Document doc = parseDocument();

        BookStore bookStore = new BookStore();
        NodeList booksList = doc.getElementsByTagName("book");

        for (int i = 0; i < booksList.getLength(); i++) {
            Node bookNode = booksList.item(i);
            bookStore.addBook(createBookFromTag(bookNode));
        }

        return bookStore;
    }

    public Document parseDocument() {
        try {
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dbFactory.newDocumentBuilder();
            return builder.parse(xmlFile);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    private Book createBookFromTag(Node bookNode) {
        // NodeList bookInfo = bookNode.getChildNodes();

        Book book = new Book();
        NodeList bookData = bookNode.getChildNodes();

        book.setCategory(bookNode.getAttributes().getNamedItem("category").getTextContent());

        for (int i = 0; i < bookData.getLength(); i++) {
            Node info = bookData.item(i);
            switch (info.getNodeName()) {
                case "title":
                    book.setTitle(info.getTextContent());
                    break;
                case "author":
                    book.addAuthor(info.getTextContent());
                    break;
                case "year":
                    book.setYear(info.getTextContent());
                    break;
                case "price":
                    book.setPrice(info.getTextContent());
                    break;
            }
        }

        return book;
    }

}
