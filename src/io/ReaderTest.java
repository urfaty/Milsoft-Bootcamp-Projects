package io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReaderTest {
    public static void main(String[] args) throws IOException {
        String path = "pathof the file";
        FileReader fr = new FileReader(path);
        BufferedReader reader = new BufferedReader(fr);
        String line = null;
        StringBuilder builder = new StringBuilder();
        while ((line = reader.readLine()) != null ) {
            builder.append(line).append("\r\n");
        }
        reader.close();
        String text = builder.toString();

        System.out.println(text);
    }
}
