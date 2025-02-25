import com.opencsv.CSVWriter;
import java.io.*;

public class WriteDataToCSVFile{
    public static void main(String[] args) {
        String filePath = "CSVTestFile.csv";

        try (CSVWriter csv = new CSVWriter(new FileWriter(filePath))) {
            String[] heading = {"ID", "Name", "Department", "Salary", "Marks", "Email","Phone"};
            csv.writeNext(heading);

            String[][] data = {
                {"2115", "Bhagyodaya", "Hr", "8000","90", "fff@gmail.com", "147258369"},
                {"2116", "vikas", "IT", "4000", "65", "kkkgmail.com", "147258369"},
                {"2117", "Anuj", "Marketing", "60000", "80", "sdv@gmail.com", "14725869"},
                {"2118", "kunal", "IT", "50000", "75", cc@gmail.com", "147258369"},
                {"2119", "Jatin", "IT", "20000", "85", "sdfv@gmail.com", "147258369"}
            };

            for (String[] d : data) {
                csv.writeNext(d);
            }

            System.out.println("DONE.");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
