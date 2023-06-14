package StreamsFilesAndDirectories;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class CountCharacterTypes {
    public static void main(String[] args) throws IOException {
        List<String> strings = Files.readAllLines(
                Path.of("/Users/elena/Documents/BOBI/JAVA_ADVANCED/JAVA_ADVANCED" +
                        "/GITHUBs/Software-University-SoftUni-main" +
                        "/Java-Advanced/Streams-Files-and-Directories-Exercises" +
                        "/04. Java-Advanced-Files-and-Streams-Exercises-Resources/input.txt"));
        int vowelsSum = 0;
        int consonantsSum = 0;
        int punctuationSum = 0;
        for (String string : strings) {
            for (int i = 0; i < string.length(); i++) {
                char letter = string.charAt(i);
                if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
                    vowelsSum += 1;
                }else if (Character.isLetterOrDigit(letter) || letter == '-' || letter == '\'') {
                    consonantsSum += 1;
                }else if (letter == '!' || letter == ',' || letter == '.' || letter == '?') {
                    punctuationSum += 1;
                }
            }
        }

        System.out.println(String.format("Vowels: %d\n" +
                "Consonants: %d\n" +
                "Punctuation: %d\n", vowelsSum, consonantsSum, punctuationSum));

    }
}
