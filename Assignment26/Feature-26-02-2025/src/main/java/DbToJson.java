import org.json.JSONArray;
import org.json.JSONObject;
import java.sql.*;

class DbToJson {
    public static void main(String[] args) throws Exception {
        String url="jdbc:mysql://localhost:3306/testdb";
        String user="Kunal";
        String pass="Kunal@69796";
        Connection con=DriverManager.getConnection(url,user,pass);
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery("SELECT * FROM users");
        JSONArray jsonArray=new JSONArray();
        while(rs.next()){
            JSONObject obj=new JSONObject();
            obj.put("id",rs.getInt(1));
            obj.put("name",rs.getString(2));
            obj.put("age",rs.getInt(3));
            jsonArray.put(obj);
        }
        System.out.println(jsonArray);
        con.close();
    }
}
