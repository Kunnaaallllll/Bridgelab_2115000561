import java.io.*;

class CompareFileReaderAndInputStreamReader {
    public static void main(String[] args) throws Exception {
        String filePath = "TestFile.txt";

        long fileReaderStart = System.nanoTime();
        try (BufferedReader fileReader = new BufferedReader(new FileReader(filePath))) {
            while (fileReader.read() != -1);
        }
        long fileReaderEnd = System.nanoTime();
        System.out.println("FileReader Time Taken: " + (fileReaderEnd - fileReaderStart) / 1e6 + " ms");

        long inputStreamReaderStart = System.nanoTime();
        try (BufferedReader inputStreamReader = new BufferedReader(new InputStreamReader(new FileInputStream(filePath)))) {
            while (inputStreamReader.read() != -1);
        }
        long inputStreamReaderEnd = System.nanoTime();
        System.out.println("InputStreamReader Time Taken: " + (inputStreamReaderEnd - inputStreamReaderStart) / 1e6 + " ms");
    }
}