import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Delete_Data_In_Database {
    public static void main(String[] args) throws Exception{

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Deleted Reg No : ");
        int Reg_No = sc.nextInt();

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/srmdb1","root","Piyush95@");

        PreparedStatement ps = conn.prepareStatement("delete from student where Reg_No=?");

        ps.setInt(1,Reg_No);

        int i = ps.executeUpdate();

        if (i>0){
            System.out.println("Successfully Delete");
        }else {
            System.out.println("Failed");
        }


    }
}
