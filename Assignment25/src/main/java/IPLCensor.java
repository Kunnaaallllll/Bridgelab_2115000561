import org.json.JSONArray;
import org.json.JSONObject;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.FileWriter;
import java.util.Scanner;

class IPLCensor {
    public static void main(String[] args) throws Exception {
        String content=new String(Files.readAllBytes(Paths.get("ipl.json")));
        JSONArray matches=new JSONArray(content);
        for(int i=0;i<matches.length();i++){
            JSONObject match=matches.getJSONObject(i);
            match.put("team1",mask(match.getString("team1")));
            match.put("team2",mask(match.getString("team2")));
            match.put("winner",mask(match.getString("winner")));
            match.put("player_of_match","REDACTED");
        }
        FileWriter fw=new FileWriter("censored_ipl.json");
        fw.write(matches.toString(2));
        fw.close();

        Scanner sc=new Scanner(Paths.get("ipl.csv"));
        FileWriter csvWriter=new FileWriter("censored_ipl.csv");
        csvWriter.write(sc.nextLine()+"\n");
        while(sc.hasNextLine()){
            String[] data=sc.nextLine().split(",");
            data[1]=mask(data[1]);
            data[2]=mask(data[2]);
            data[5]=mask(data[5]);
            data[6]="REDACTED";
            csvWriter.write(String.join(",",data)+"\n");
        }
        sc.close();
        csvWriter.close();
    }
    static String mask(String team){
        return team.replaceAll(" (Indians|Kings|Bangalore|Capitals)$"," ***");
    }
}
