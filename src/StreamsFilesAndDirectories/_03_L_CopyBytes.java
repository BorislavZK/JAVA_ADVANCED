package StreamsFilesAndDirectories;

import java.io.*;

public class _03_L_CopyBytes {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("/Users/elena/Documents/BOBI/JAVA_ADVANCED/JAVA_ADVANCED/Java_Advanced_Project/src/StreamsFilesAndDirectories/04. Java-Advanced-Files-and-Streams-Lab-Resources/input.txt");
        FileOutputStream fos = new FileOutputStream("/Users/elena/Documents/BOBI/JAVA_ADVANCED/JAVA_ADVANCED/Java_Advanced_Project/src/StreamsFilesAndDirectories/04. Java-Advanced-Files-and-Streams-Lab-Resources/03.CopyBytesOutput.txt");
        int currentChar = fis.read();
        while (currentChar != -1) {
            if (currentChar == ' ' || currentChar==10) {
                fos.write(currentChar);
            } else {
                fos.write(String.valueOf(currentChar).getBytes());
            }
            currentChar = fis.read();
        }
    }
}