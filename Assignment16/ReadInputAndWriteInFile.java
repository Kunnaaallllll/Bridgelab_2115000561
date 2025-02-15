import java.util.*;
import java.io.*;
public class ReadInputAndWriteInFile {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try{
            InputStreamReader isr=new InputStreamReader(System.in);
            BufferedReader br=new BufferedReader(isr);
            FileWriter fw=new FileWriter("output.txt");
            String line;
            while (!(line=br.readLine()).equals("exit")) {
                fw.write(line+"\n");
            }

        }catch (Exception e) {
            System.out.println(e);
        }
    }
}
