package Advanced_Java_Projects.Mini_Projects;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCnxtExample {
    public static void main(String[] args) throws SQLException {

        String url = "jdbc:sql://localhost:3307/abc";

        int Sno = 0;
        String Tname = " ";
        String Tmobile = "";
        String Temail = "";
        String Taddress = "";
        String Ttechnology = "";
        String query = "INSERT INTO abc(Sno, Tname, Tmobile, Temail, Taddress, Ttechnology)" +"values(" + Sno +",'"+Tname+"','" + Tmobile + "','" + Temail +"','" + Taddress + "' + '"+ Ttechnology +"'  )";
        Connection con = null;
        System.out.println("Database connection established");


        try{

            con = DriverManager.getConnection(url,"root","Sheikh@7348");
            Statement st = con.createStatement();
            int m = st.executeUpdate(query);
            System.out.println("Connected");

        } catch (Exception ex){
            throw new RuntimeException("Not connected"+ ex);

        }

    }
}
