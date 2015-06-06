package eu.unipv.zanussi.fdi2.httpd;

import java.io.*;
import java.net.Socket;

public class FileService implements IService {

    @Override
    public void sendHTTP(Socket clientSocket, HttpRequest request) throws IOException {
        String fileName = checkURI(request.getUri());

        HttpMessage message = new HttpMessage();
        message.openHttpAnswer(clientSocket, getMime(request.getUri()));
        copyFile(fileName, message.getOut());
        message.closeHttpAnswer();
    }

    private static void copyFile(String fileName, OutputStreamWriter out) throws IOException {
        BufferedReader fileReader = new BufferedReader(new FileReader(fileName));
        String fileLine = fileReader.readLine();

        // Wants OutputStream to write bytes (used 4 images)
        //byte[] bytes = Files.readAllBytes(Paths.get(fileName));
        //out.write(bytes);

        while (fileLine != null) {
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

    private static String checkURI(String uri) {
        String fileName = ServerConstants.SERVER_ROOT_PATH + uri;

//        File webFolder = new File("web");
//        File[] files = webFolder.listFiles();
//
//        boolean found = false;
//        for (File file : files)
//            if (file.getName().endsWith(fileName)) found = true;
//        if (!found)
//            fileName = "web/error.html";

        File file = new File(fileName);
        if (!file.isFile())
            fileName = ServerConstants.SERVER_ROOT_PATH + "/error.html";
        return fileName;
    }

}
