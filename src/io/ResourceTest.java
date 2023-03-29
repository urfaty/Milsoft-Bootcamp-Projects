package io;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class ResourceTest {
    public static void main(String[] args)  {

        String path = "Desktop/deneme.txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path))) {
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
            System.out.println("went wroddng");
            e.printStackTrace();
        }





    }
}
