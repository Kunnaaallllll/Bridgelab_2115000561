import org.json.JSONArray;
import org.json.JSONObject;
import java.util.Scanner;

class CsvToJson {
    public static void main(String[] args) {
        String csv="name,age\nKunal,21\nArush,14";
        Scanner sc=new Scanner(csv);
        String[] headers=sc.nextLine().split(",");
        JSONArray jsonArray=new JSONArray();
        while(sc.hasNextLine()){
            String[] values=sc.nextLine().split(",");
            JSONObject obj=new JSONObject();
            for(int i=0;i<headers.length;i++){
                obj.put(headers[i],values[i]);
            }
            jsonArray.put(obj);
        }
        System.out.println(jsonArray);
    }
}
