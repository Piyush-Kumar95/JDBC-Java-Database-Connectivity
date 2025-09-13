import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Fetch_Data_From_Database {

    public static void main(String[] args) throws Exception {

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/srmdb1","root","Piyush95@");

        PreparedStatement ps = conn.prepareStatement("select * from student");

        ResultSet rs = ps.executeQuery();

        while (rs.next()){
            int Reg = rs.getInt("Reg_No");
            System.out.println("Reg No : "+Reg);

            String Name = rs.getString("Name");
            System.out.println("Name : "+Name);

            String Course = rs.getString("Course");
            System.out.println("Course : "+Course);

            System.out.println("---------------------");

        }

    }
}
