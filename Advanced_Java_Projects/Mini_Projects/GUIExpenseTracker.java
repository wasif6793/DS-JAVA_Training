package Advanced_Java_Projects.Mini_Projects;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
public class GUIExpenseTracker {

    private static final JLabel todayexp = new JLabel("Today's Expense");
    private static final JLabel expensetypeLabel = new JLabel("Expense Type:");
    private static final JLabel amoountLabel = new JLabel("Amount:");
    private static final JTextField expensefield = new JTextField();
    private static final JTextField amountfield = new JTextField();
    private static final JButton addButton = new JButton("ADD");
    private static final JButton viewButton = new JButton("VIEW");
    public static void main(String[] args) throws SQLException{

        JFrame frame = new JFrame("Expense Tracker");



        addButton.addActionListener(new AddbuttonListener());
        viewButton.addActionListener((new ViewButtonListener()));

        jdbcexpense(frame);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(400,300);
    }
    private static void jdbcexpense(JFrame frame) {

        todayexp.setBounds(50,40,100,40);
        expensetypeLabel.setBounds(50,85,100,20);
        amoountLabel.setBounds(90,107,100,20);

        expensefield.setBounds(145,85,80,20);
        amountfield.setBounds(145,107,80,20);

        addButton.setBounds(147,135,75,25);
        viewButton.setBounds(230,135,75,25);

        frame.add(todayexp);
        frame.add(expensetypeLabel);
        frame.add(amoountLabel);
        frame.add(amountfield);
        frame.add(expensefield);
        frame.add(viewButton);
        frame.add(addButton);

    }
    public static class ViewButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            try{
                viewExpenses();
            } catch (Exception e){
                throw new RuntimeException(e);
            }
        }

        private static void viewExpenses() throws SQLException{
            String url = "JDBC:mysql://localhost:43306/expensedb";
            Connection con = DriverManager.getConnection(url,"root","Sheikh@7348");
            String query = "SELECT * FROM expensetb";

            try {

                Statement st =con.createStatement() ;
                ResultSet rs = st.executeQuery(query);
                JTable table = new JTable(buildTableModel(rs));
                JOptionPane.showMessageDialog(null, new JScrollPane(table));

            } catch (SQLException e) {
                throw new RuntimeException(e);
            } finally {
                con.close();
            }
        }
    }
    private static javax.swing.table.TableModel buildTableModel(ResultSet rs) throws SQLException {
        java.sql.ResultSetMetaData metaData = rs.getMetaData();

        java.util.Vector<String> columnNames = new java.util.Vector<>();
        int columnCount = metaData.getColumnCount();
        for (int column = 1; column <= columnCount; column++) {
            columnNames.add(metaData.getColumnName(column));
        }

        java.util.Vector<java.util.Vector<Object>> data = new java.util.Vector<>();
        while (rs.next()) {
            java.util.Vector<Object> vector = new java.util.Vector<>();
            for (int columnIndex = 1; columnIndex <= columnCount; columnIndex++) {
                vector.add(rs.getObject(columnIndex));
            }
            data.add(vector);
        }
        return new javax.swing.table.DefaultTableModel(data, columnNames);
    }

    public static class AddbuttonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            try{
                addexpense();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        private static void addexpense() throws SQLException{
            String url = "JDBC:mysql://localhost:43306/expensedb";
            String espensetype = expensefield.getText();
            Connection con = DriverManager.getConnection(url,"root","Sheikh@7348");
            int expenseamount = Integer.parseInt(amountfield.getText());
            String query = "INSERT INTO expensetb(espensetype, expenseamount)VALUES('" + espensetype + "'," + expenseamount +")";
            try {
                Statement st =con.createStatement() ;
                int m = st.executeUpdate(query);
                if(m == 1){
                    JOptionPane.showMessageDialog(null,"Updated!!");
                    expensefield.setText("");
                    amountfield.setText("");

                } else {
                    JOptionPane.showMessageDialog(null,"Value Mismatch, Retry");
                }

            } catch (SQLException e) {
                throw new RuntimeException(e);
            } finally {
                con.close();
            }
        }
    }

}
