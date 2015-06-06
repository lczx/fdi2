package eu.unipv.zanussi.fdi2.httpd;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

public class Server {

    private final int port;

    private Map<String, IService> services = new HashMap<>();

    public Server(int port) {
        this.port = port;
    }

    public void addService(String name, IService service) {
        services.put(name, service);
    }

    public void launch() {
        try {
            ServerSocket socket = new ServerSocket(port);

            while (true) {
                final Socket clientSocket = socket.accept();

                Runnable runnable = () -> {
                    try {
                        HttpRequest request = new HttpRequest(clientSocket);
                        String uri = request.getUri();

                        IService service = services.get(uri);
                        if (service == null) service = new FileService();

                        service.sendHTTP(clientSocket, request);

                        /*
                        if (uri.equals("/books02.html"))
                            new BooksService().sendHTTP(clientSocket, fileName);
                        else
                            new FileService().sendHTTP(clientSocket, fileName);
                        */

                        clientSocket.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                };

                Thread thread = new Thread(runnable);
                thread.start();
            }

            // Unreachable: "socket.close();"

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    /*
    static String getResourcepath(String resName) {
        String ret = "HTTP Server/web/";
        if (resName.equals("/"))
            ret += "/index.html";
        else
            ret += resName;

        return ret;
    }
    */

}
