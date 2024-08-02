package Advanced_Java_Projects.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCnxtExample {
    public static void main(String[] args) throws SQLException {

        String url = "jdbc:mysql://localhost:3306/guidemo";

        int Sno = 1;
        String Tname = "Pawan Sir ";
        String Tmobile = "1234567890";
        String Temail = "abc@gmail.com";
        String Taddress = "abc,123,!@#";
        String Ttechnology = "Java";
        String query = "INSERT INTO trainers(Sno, Tname, Tmobile, Temail, Taddress, Ttechnology)" +"values(" + Sno +",'"+Tname+"','" + Tmobile + "','" + Temail +"','" + Taddress + "' + '"+ Ttechnology +"'  )";
        Connection con = DriverManager.getConnection(url,"root","");
        System.out.println("Database connection established");


        try{
            Statement st = con.createStatement();
            int m = st.executeUpdate(query);
            if(m == 1){
                System.out.println("Inserted successfully: "+ query);
            }
            else{
                System.out.println("Not inserted or Insertion failed ");
            }
            System.out.println("Connected");

        } catch (Exception ex){
            throw new RuntimeException("Insertion Failed  "+ ex);

        } finally {
            con.close();
        }

    }
}
