package eu.unipv.zanussi.fdi2.httpd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class HttpRequest {

    private String uri;

    public HttpRequest(final Socket clientSocket) throws IOException {
        BufferedReader in = new BufferedReader((
                // Retrieves bytes send from the client
                new InputStreamReader(clientSocket.getInputStream())
        ));

        String line = in.readLine();

        List<String> lines = new LinkedList<>();
        while (line != null) {
            System.out.println(line);
            lines.add(line);
            line = in.readLine();
            if (line.length() == 0) line = null;
        }

        StringTokenizer st = new StringTokenizer(lines.get(0));
        st.nextToken();

        this.uri = st.nextToken();
    }

    public String getUri() {
        return uri;
    }

}
