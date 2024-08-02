package Advanced_Java_Projects.JDBC;


import java.sql.*;

public class ExpenseJDBC {

    public static void main(String[] args) throws SQLException{

        expensejdbc();
    }

    private static void expensejdbc() throws SQLException {

        String url ="jdbc:mysql://localhost:3306/expensedb";

        Connection con = DriverManager.getConnection(url,"root","" );

        String espensetype = "Snacks";
        int expenseamount = 120;

        String query = "INSERT INTO expensetb(espensetype, expenseamount)VALUES('" + espensetype + "'," + expenseamount +")";

        try{
            con = DriverManager.getConnection(url,"root","");

           // PreparedStatement sta = con.prepareStatement();

            Statement st = con.createStatement();
            int m = st.executeUpdate(query);
            if(m == 1){
                System.out.println("Connection Established ");
            } else {
                System.out.println("Didn't connect  ");
            }
            } catch(Exception ex){
            System.out.println(ex);

        } finally {
            con.close();
        }
    }
}
