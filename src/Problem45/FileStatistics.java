package Problem45;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileStatistics {
    public static void main(String[] args) {
        String filePath = "example.txt";
        try {
            int[] result = getFileStatistics(filePath);
            System.out.println("Number of characters: " + result[0]);
            System.out.println("Number of words: " + result[1]);
            System.out.println("Number of lines: " + result[2]);
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }

    public static int[] getFileStatistics(String filePath) throws IOException {
        int charCount = 0;
        int wordCount = 0;
        int lineCount = 0;

        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line;

        while ((line = reader.readLine()) != null) {
            lineCount++;
            charCount += line.length();
            String[] words = line.split("\\s+");
            wordCount += words.length;
        }

        reader.close();

        return new int[]{charCount, wordCount, lineCount};
    }
}

