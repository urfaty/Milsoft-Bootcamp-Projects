package io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriterTest {
    public static void main(String[] args)  {

        BufferedWriter writer = null;

        try {
            String path = "Desktop/deneme.txt";
            FileWriter fw = new FileWriter(path);
            writer = new BufferedWriter(fw);

            writer.write("HTML");
            writer.write("CSS");
            writer.write("JavaScript");
            writer.write("AJAX");
            writer.write("HTML");
            writer.write("HTML");
            writer.write("HTML");
            writer.write("HTML");
        }
        catch (Exception e) {
            System.out.println("went wrong");
            e.printStackTrace();
        } finally {
            if (writer != null ) {
                try {
                    writer.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
