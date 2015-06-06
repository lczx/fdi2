package eu.unipv.zanussi.fdi2.httpd;

import java.io.IOException;
import java.net.Socket;

/**
 * Generic service
 * <p/>
 * TODO: Review JavaDoc
 */
public interface IService {

    /**
     * TODO: make filename const, change it with HttpRequest component
     *
     * @param clientSocket
     * @param request
     * @throws IOException
     */
    void sendHTTP(final Socket clientSocket, HttpRequest request) throws IOException;

}
