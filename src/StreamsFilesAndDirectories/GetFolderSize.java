package StreamsFilesAndDirectories;

import java.io.File;

public class GetFolderSize {
    public static void main(String[] args) {
        File directory = new File("/Users/elena/Documents" +
                "/BOBI/JAVA_ADVANCED/JAVA_ADVANCED/GITHUBs/Software-University-SoftUni-main" +
                "/Java-Advanced/Streams-Files-and-Directories-Exercises" +
                "/04. Java-Advanced-Files-and-Streams-Exercises-Resources/Exercises Resources");

        File[] files = directory.listFiles();
        int sum = 0;
        for (File file : files) {
            sum += file.length();
        }
        System.out.printf("Folder size: %d",sum);
    }
}
