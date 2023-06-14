package StreamsFilesAndDirectories;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class MergeTwoFiles {
    public static void main(String[] args) throws IOException {
        List<String> firstIn = Files.readAllLines(Path.of("D:\\Advanced Programing With Java" +
                "\\04. Java-Advanced-Streams-Files-and-Directories-Exercises" +
                "\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputOne.txt"));

        List<String> secondIn = Files.readAllLines(Path.of("D:\\Advanced Programing With Java" +
                "\\04. Java-Advanced-Streams-Files-and-Directories-Exercises" +
                "\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputTwo.txt"));

        FileWriter fileWriter = new FileWriter("out.txt");

        for (String fI : firstIn) {
            fileWriter.write(fI + "\n");
        }

        for (String sI : secondIn) {
            fileWriter.write(sI + "\n");
        }

        fileWriter.flush();


    }
}
