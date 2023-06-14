package StreamsFilesAndDirectories;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;


public class WordCount {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(new FileInputStream("D:\\Advanced Programing With Java" +
                "\\04. Java-Advanced-Streams-Files-and-Directories-Exercises" +
                "\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\words.txt"));

        List<String> text = Files.readAllLines(Path.of("D:\\Advanced Programing With Java\\" +
                "04. Java-Advanced-Streams-Files-and-Directories-Exercises" +
                "\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\text.txt"));
        String textAsString = text.toString();

        String line = scan.nextLine();
        String[] splitWords = line.split("\\s+");
        Map<String, Integer> map = new HashMap<>();
        String newText = textAsString.replaceAll(",", "");
        String[] splitText = newText.split("\\s+");

        for (String splitWord : splitWords) {
            for (int i = 0; i < splitText.length; i++) {
                if (splitWord.equals(splitText[i])) {
                    if (!map.containsKey(splitWord)) {
                        map.put(splitWord, 1);
                    } else {
                        Integer oldValue = map.get(splitWord);
                        map.put(splitWord, oldValue + 1);
                    }
                }
            }
        }
        FileWriter fileWriter = new FileWriter("result.txt");
        map
                .entrySet()
                .stream()
                .sorted((k1, k2) -> {
                    return k2.getValue() - k1.getValue();
                })
                .forEach(e -> {
                    try {
                        fileWriter.write(String.format("%s - %d%n",e.getKey(),e.getValue()));
                        fileWriter.flush();
                    } catch (IOException ioException) {
                        ioException.printStackTrace();
                    }
                });
    }
}
