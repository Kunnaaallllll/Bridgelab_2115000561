import java.io.*;
import java.sql.*;

public class ExportToCSV{
    public static void main(String[] args){
        String url="jdbc:mysql://localhost:3306/employee_db";
        String user="kunal";
        String password="Kunal@69796";
        String query="SELECT EmployeeID, Name, Department, Salary FROM employees";
        
        try(Connection con=DriverManager.getConnection(url,user,password);
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery(query);
            PrintWriter pw=new PrintWriter(new File("employees.csv"))){
            
            pw.println("Employee ID,Name,Department,Salary");
            while(rs.next()){
                pw.println(rs.getInt(1)+","+rs.getString(2)+","+rs.getString(3)+","+rs.getDouble(4));
            }
            System.out.println("CSV file generated successfully.");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
