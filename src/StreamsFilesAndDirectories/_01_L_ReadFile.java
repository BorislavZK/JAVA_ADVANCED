package StreamsFilesAndDirectories;

import java.io.*;

public class _01_L_ReadFile {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("/Users/elena/Documents/BOBI/JAVA_ADVANCED/JAVA_ADVANCED/Java_Advanced_Project/src/StreamsFilesAndDirectories/04. Java-Advanced-Files-and-Streams-Lab-Resources/input.txt");
        int currentByte = fis.read();
        while (currentByte != -1) {
            System.out.print(Integer.toBinaryString(currentByte) + " ");
            currentByte = fis.read();
        }
    }
}