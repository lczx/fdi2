package eu.unipv.zanussi.fdi2.httpd.xml;

import eu.unipv.zanussi.fdi2.httpd.ServerConstants;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class TestXML {

    public static void main(String[] args) {
        LibraryLoader loader = new LibraryLoader(ServerConstants.APPLICATION_PATH + "/books.xml");
        System.out.println(loader.createLibrary());
    }

    private void ahahha() {
        File xmlFile = new File("HTTP Server/books.xml");

        try {
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dbFactory.newDocumentBuilder();
            Document doc = builder.parse(xmlFile);

            NodeList booksList = doc.getElementsByTagName("book");

            for (int i = 0; i < booksList.getLength(); i++) {
                Node book = booksList.item(i);
                NodeList bookInfo = book.getChildNodes();

                for (int j = 0; j < bookInfo.getLength(); j++) {
                    Node info = bookInfo.item(j);
                    String nodeName = info.getNodeName();
                    String textContent = info.getTextContent();
                    System.out.println(nodeName + " [" + textContent + "]");
                }
            }

        } catch (Exception e) {
            // TODO: Verify Exception documentation
            e.printStackTrace();
        }
    }

}