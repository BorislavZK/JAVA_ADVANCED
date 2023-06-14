package StreamsFilesAndDirectories;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class LineNumbers {
    public static void main(String[] args) {
        try {
            List<String> strings = Files.readAllLines(Path.of("D:\\Advanced Programing With Java" +
                    "\\04. Java-Advanced-Streams-Files-and-Directories-Exercises" +
                    "\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputLineNumbers.txt"));
            FileWriter fileWriter = new FileWriter("output.txt");
            int cnt = 1;
            for (String string : strings) {
                fileWriter.write(cnt++ + ". " +string + "\n");
                fileWriter.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
