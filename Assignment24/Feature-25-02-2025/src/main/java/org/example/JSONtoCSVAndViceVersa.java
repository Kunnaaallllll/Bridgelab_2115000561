import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.bean.CsvBindByPosition;
import com.fasterxml.jackson.databind.*;
import java.io.*;
import java.util.*;

public class JSONtoCSVAndViceVersa {
    public static void jsonTocsv(String currentPath, String destinationPath) throws Exception{
        ObjectMapper om = new ObjectMapper();//(from Jackson library) is used to read JSON.
        List<Student1> students = Arrays.asList(om.readValue(new File(currentPath), Student1[].class));
        try(Writer wr = new FileWriter(destinationPath);
            CSVWriter csv = new CSVWriter(wr)){
            csv.writeNext(new String[]{"ID", "Name", "Age", "Marks", "Grade"});

            for (Student1 student : students) {
                csv.writeNext(new String[]{
                        String.valueOf(student.getId()),
                        student.getName(),
                        String.valueOf(student.getAge()), 
                        String.valueOf(student.getMarks()),  
                        student.getGrade()
                });
            }
        }
        System.out.println("DONE");
    }
    public static void csvTojson(String currentPath, String destinationPath) throws Exception{
        try(Reader rd = new FileReader(currentPath);
        CSVReader csv = new CSVReader(rd)){
            List<Student1> students = new ArrayList<>();
            csv.readNext();
            String[] data;
            while((data = csv.readNext()) != null){
                students.add(new Student1(
                        Integer.parseInt(data[0]), data[1], Integer.parseInt(data[2]),
                        Integer.parseInt(data[3]), data[4]
                ));
            }

            ObjectMapper om = new ObjectMapper();
            om.writerWithDefaultPrettyPrinter().writeValue(new File(destinationPath), students);
        }
        System.out.println("DONE");
    }
    public static void main(String[] args) throws Exception {
        jsonTocsv("StudentJSON.json","StudentCSV.csv");
        csvTojson("StudentCSV.csv","StudentJSON.json");
    }
}
class Student1{
    @CsvBindByPosition(position = 0) private int id;
    @CsvBindByPosition(position = 1) private String name;
    @CsvBindByPosition(position = 2) private int age;
    @CsvBindByPosition(position = 3) private int marks;
    @CsvBindByPosition(position = 4) private String grade;

    public Student1() {}

    public Student1(int id, String name, int age, int marks, String grade) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.marks = marks;
        this.grade = grade;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public int getMarks() { return marks; }
    public String getGrade() { return grade; }
}
