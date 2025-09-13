import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Insert_Data_Database {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Reg No : ");
        int Reg_No = sc.nextInt();

        System.out.print("Enter Your Name : ");
        String Name = sc.next();

        System.out.print("Enter Your Course : ");
        String Course = sc.next();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/srmdb1", "root", "Piyush95@");

            PreparedStatement ps = conn.prepareStatement("insert into student values(?,?,?)");

            ps.setInt(1,Reg_No);
            ps.setString(2,Name);
            ps.setString(3,Course);

            int i = ps.executeUpdate();

            if (i > 0) {
                System.out.println("Successfully Insert Data ");
            } else {
                System.out.println("Failed");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
