package StreamsFilesAndDirectories;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class AllCapitals {
    public static void main(String[] args) throws IOException {
        List<String> strings = Files.readAllLines(Path.of("/Users/elena/Documents/BOBI" +
                "/JAVA_ADVANCED/JAVA_ADVANCED/GITHUBs" +
                "/Software-University-SoftUni-main/Java-Advanced" +
                "/Streams-Files-and-Directories-Exercises" +
                "/04. Java-Advanced-Files-and-Streams-Exercises-Resources/input.txt"));
        for (String string : strings) {
            System.out.println(string.toUpperCase());

        }

    }
}
