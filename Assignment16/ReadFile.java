import java.io.*;

public class ReadFile {
    public static void main(String[] args) {
        try{
            FileReader fr=new FileReader("file1.txt");
            BufferedReader br=new BufferedReader(fr);
            String line;
            while((line=br.readLine())!=null){
                System.out.println(line);
            }
        }catch(IOException e){
            System.out.println("koi file nhi hh");
        }

    }
}