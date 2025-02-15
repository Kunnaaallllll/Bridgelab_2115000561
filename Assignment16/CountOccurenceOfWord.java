import java.io.*;
public class CountOccurenceOfWord {
    public static void main(String[] args) {
        try {
            int count=0;
            String str="kunal";
            FileReader fr = new FileReader("file1.txt");
            BufferedReader br = new BufferedReader(fr);
            String line;
            while((line=br.readLine())!=null){
                String words[]=line.split(" ");
                for(String word:words){
                    if(word.equals(str)){
                        count++;
                    }
                }
            }
            System.out.println(count);
        }catch(Exception e){
            System.out.println(e);
        }

    }
}
