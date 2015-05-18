package eu.unipv.zanussi.fdi2.files;

import java.io.*;

public class Example01 {

    // Should use resources with "numbers.txt" to get an InputStream instead.
    public static final String FILE_NAME = "course/misc/src/main/resources/numbers.txt";

    public static void main(String[] args) {
        writeFile();
        readFile();
    }

    private static void writeFile() {
        try {
            FileWriter writer = new FileWriter(new File(FILE_NAME));
            for (int i = 0; i < 10; i++) writer.write("" + i);
            writer.close();
        } catch (IOException e) {
            // Out of disk space? Or the file is already open from another process?
            e.printStackTrace();
        }
    }

    private static void readFile() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(new File(FILE_NAME)));
            String line = reader.readLine();
            while (line != null) {
                System.out.println(line);
                line = reader.readLine();
            }
        } catch (IOException e /* + FileNotFoundException, its subclass */) {
            // WTF is that file??? (FileNotFoundEx*) or Broken disk!? (IOEx*)
            e.printStackTrace();
        }
    }

}
