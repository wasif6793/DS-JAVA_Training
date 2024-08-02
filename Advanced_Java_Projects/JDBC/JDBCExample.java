package Advanced_Java_Projects.JDBC;

import java.sql.*;
import java.util.Scanner;

public class JDBCExample {
    public static void main(String[] args) throws SQLException {


        jdbc();
    }

    private static void jdbc() throws SQLException{
        Scanner sc = new Scanner(System.in);
        String url = "jdbc:mysql://localhost:3306/demo";
        Connection conn = null;
        System.out.print("Enter name: ");
        String tabledemocol = sc.nextLine();
        System.out.println();
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        System.out.println();
        System.out.print("Enter Roll no.: ");
        int rn = sc.nextInt();
        System.out.println();
        System.out.print("Enter phone number: ");
        String pno =sc.next();

        String sql = "INSERT INTO tabledemo(rn, age, tabledemocol, pno)" + "values(" + rn + ", " + age +", '" + tabledemocol + "','" + pno +"' )";


        try{
            conn = DriverManager.getConnection(url,"root","");
            Statement st = conn.createStatement();
            int m = st.executeUpdate(sql);
            if(m == 1){
                System.out.println("Inserted Successfully:" + sql);
            } else {
                System.out.println("Insertion failed");

            }
        } catch (Exception ex){
            System.out.println(ex);
        }finally {
            conn.close();
        }
    }

}
