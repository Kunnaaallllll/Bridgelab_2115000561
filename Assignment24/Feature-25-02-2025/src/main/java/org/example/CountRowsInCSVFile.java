import com.opencsv.CSVReader;
import java.io.*;

public class CountRowsInCSVFile{
    public static void main(String[] args) {
        String filePath="CSVTestFile.csv";
        int count=0;

        try (CSVReader csv = new CSVReader(new FileReader(filePath))) {
            csv.readNext();
            while (csv.readNext()!=null){
                count++;
            }
            System.out.println("Total number of Rowss (excluding header): " + count);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}