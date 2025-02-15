import java.io.*;
public class ByteStreamToCharacterStream {
    public static void main(String[] args) {
        try{
            FileInputStream fis=new FileInputStream("file1.txt");
            InputStreamReader isr=new InputStreamReader(fis);
            BufferedReader br=new BufferedReader(isr);
            String line;
            while((line= br.readLine())!=null){
                System.out.println(line);
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
