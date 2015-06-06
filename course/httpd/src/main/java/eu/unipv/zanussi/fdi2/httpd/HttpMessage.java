package eu.unipv.zanussi.fdi2.httpd;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.nio.charset.Charset;

/**
 * Manages HTTP answers
 *
 * Calls to 'openHttpAnswer' must always be followed by 'closeHttpAnswer'.
 */
public class HttpMessage {

    OutputStreamWriter out;

    public void openHttpAnswer(Socket clientSocket, String mime) throws IOException {
        OutputStream os = clientSocket.getOutputStream();
        this.out = new OutputStreamWriter(os, Charset.forName("UTF-8").newEncoder());

        out.write(
                "HTTP/1.1 200 OK\r\n" +
                //"Date: Tue, 17 Mar 2014 14:47:00\r\n" +
                "Content-Type: " + mime + "\r\n" +
                "\r\n"
        );
        out.flush();
    }

    public void closeHttpAnswer() throws IOException {
        //out.write("\n");
        out.close();
    }

    public OutputStreamWriter getOut() {
        return out;
    }

}
