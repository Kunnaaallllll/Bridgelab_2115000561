import org.json.JSONObject;
import org.json.XML;

class JsonToXml {
    public static void main(String[] args) {
        String jsonData = "{\"name\":\"Kunal\",\"age\":21}";
        JSONObject jsonObject = new JSONObject(jsonData);
        String xml = XML.toString(jsonObject);
        System.out.println(xml);
    }
}
