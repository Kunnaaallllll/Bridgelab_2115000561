import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

class JsonValidator {
    public static void main(String[] args) {
        String json="{\"name\":\"Kunal\",\"age\":21}";
        ObjectMapper mapper=new ObjectMapper();
        try{
            JsonNode node=mapper.readTree(json);
            System.out.println("Valid JSON");
        }catch(Exception e){
            System.out.println("Invalid JSON");
        }
    }
}
