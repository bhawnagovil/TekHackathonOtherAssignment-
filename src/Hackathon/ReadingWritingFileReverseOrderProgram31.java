package Hackathon;

import org.apache.batik.svggen.font.table.CmapIndexEntry;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReadingWritingFileReverseOrderProgram31 {
    public static void reverseFileContent(String inputFile, String outputFile) {
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {

            // Read the content of the original file line by line
            List<String> contents = new ArrayList<>();
            String content = null;
            while ((content = reader.readLine()) != null) {
                contents.add(content);
            }
            Collections.reverse(contents);
            for (String reversedlines : contents) {
                writer.write(reversedlines);
            }
            System.out.println("file content got reversed");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static void main(String[] args) {
        String s = System.getProperty("user.dir");
        String inputFile= ( s + "/resources/data1.txt");
        String outputFile= (s+"/resources/data.txt" );
        reverseFileContent(inputFile,outputFile);

    }
}
