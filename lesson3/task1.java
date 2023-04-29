package lesson3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class task1 {
    private static void main (Path pathRead, Path pathWrite) {
        // BufferedReader in = null;
        // BufferedWriter out = null;
        try(BufferedReader in = new BufferedReader(Files.newBufferedReader(pathRead)); BufferedWriter out = new BufferedWriter(Files.newBufferedWriter(pathWrite))){
            in = Files.newBufferedReader(pathRead);
            out = Files.newBufferedWriter(pathWrite);
            out.write(in.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (in != null) {
                    in.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                if (out != null) {
                    out.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
