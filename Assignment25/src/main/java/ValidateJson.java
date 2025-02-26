import org.json.*;

class ValidateJson {
    public static void main(String[] args) {
        String json = "{\"name\":\"Kunal\",\"age\":21}";
        String jsonArray = "[{\"name\":\"Kunal\"\"age\":21}, {\"name\":\"Arush\",\"age\":14}]";
        System.out.println(isValidJsonObject(json));
        System.out.println(isValidJsonArray(jsonArray));
    }
    static boolean isValidJsonObject(String json) {
        try {
            new JSONObject(json);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    static boolean isValidJsonArray(String json) {
        try {
            new JSONObject(json);
            return true;
        } catch (Exception e1) {
            try {
                new JSONArray(json);
                return true;
            } catch (Exception e2) {
                return false;
            }
        }
    }
}
