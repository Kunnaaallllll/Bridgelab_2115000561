import org.json.*;
import java.nio.file.*;


class ValidateEmailUsingJson {
    public static void main(String[] args) throws Exception {
        String data = new String(Files.readAllBytes(Paths.get("Data.json")));
        JSONArray jsonArray = new JSONArray(data);
        JSONObject jsonObject = jsonArray.getJSONObject(0);
        System.out.println(isValidEmail(jsonObject)?"Valid Email":"InValid Email");
    }

    static boolean isValidEmail(JSONObject jsonObject) {
        String email = jsonObject.getString("email");
        return email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$");
    }
}
