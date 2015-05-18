package eu.unipv.zanussi.fdi2.files.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileLoader {

    private String fileName;
    private ILineLoader lineLoader;

    public FileLoader(ILineLoader lineLoader, String fileName) {
        this.lineLoader = lineLoader;
        this.fileName = fileName;
    }

    public void loadFile() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(new File(fileName)));

            String line = reader.readLine();
            while (line != null) {
                lineLoader.loadLine(line);
                line = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
