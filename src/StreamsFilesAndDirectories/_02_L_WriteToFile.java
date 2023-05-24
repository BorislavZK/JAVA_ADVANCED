package StreamsFilesAndDirectories;

import java.io.*;
import java.util.Set;

public class _02_L_WriteToFile {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("/Users/elena/Documents/BOBI/JAVA_ADVANCED/JAVA_ADVANCED/Java_Advanced_Project/src/StreamsFilesAndDirectories/04. Java-Advanced-Files-and-Streams-Lab-Resources/input.txt");
        InputStreamReader iso = new InputStreamReader(fis);
        BufferedWriter bw = new BufferedWriter(new FileWriter("/Users/elena/Documents/BOBI/JAVA_ADVANCED/JAVA_ADVANCED/Java_Advanced_Project/src/StreamsFilesAndDirectories/04. Java-Advanced-Files-and-Streams-Lab-Resources/02.WriteToFileOutput.txt"));
        int currentChar = fis.read();
        Set<Character> chars = Set.of(',', '.', '!', '?');
        while (currentChar != 65535) {
            if (!chars.contains((char) currentChar)) {
                bw.write(currentChar);
            }
            currentChar = (char) iso.read();
        }
        bw.close();
    }
}