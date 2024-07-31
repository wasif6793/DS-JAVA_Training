package Advanced_Java_Projects.Mini_Projects;

import java.sql.*;
public class JDBCExample {
    public static void main(String[] args) throws SQLException {

        jdbc();
    }

    private static void jdbc() throws SQLException{
        String url = "jdbc:mysql://localhost:3306/demo";
        Connection conn = DriverManager.getConnection(url,"root","Sheikh@7348");
        String tabledemocol = "Aman";
        int age = 22;
        int rn = 12;
        String pno = "1234567890";

        String sql = "INSERT INTO tabledemo(rn, age, tabledemocol, pno)" + "values(" + rn + ", " + age +", '" + tabledemocol + "','" + pno +"' )";


        try{
            conn = DriverManager.getConnection(url,"root","Sheikh@7348");
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
