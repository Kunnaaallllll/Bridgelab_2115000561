import java.io.*;
import java.util.*;

public class FileReaderVsInputStreamReader {
    public static void main(String[] args) throws IOException {
        String filePath = "largefile.txt"; 

        long startTime = System.nanoTime();
        int wordCountFileReader = countWordsUsingFileReader(filePath);
        long endTime = System.nanoTime();
        System.out.println("FileReader word count: " + wordCountFileReader);
        System.out.println("FileReader time: " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        int wordCountInputStreamReader = countWordsUsingInputStreamReader(filePath);
        endTime = System.nanoTime();
        System.out.println("InputStreamReader word count: " + wordCountInputStreamReader);
        System.out.println("InputStreamReader time: " + (endTime - startTime) + " ns");
    }

    public static int countWordsUsingFileReader(String filePath) throws IOException {
        FileReader fr = new FileReader(filePath);
        BufferedReader br = new BufferedReader(fr);
        int wordCount = 0;
        String line;
        while ((line = br.readLine()) != null) {
            wordCount += line.split("\\s+").length;
        }
        br.close();
        return wordCount;
    }

    public static int countWordsUsingInputStreamReader(String filePath) throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream(filePath));
        BufferedReader br = new BufferedReader(isr);
        int wordCount = 0;
        String line;
        while ((line = br.readLine()) != null) {
            wordCount += line.split("\\s+").length;
        }
        br.close();
        return wordCount;
    }
}
