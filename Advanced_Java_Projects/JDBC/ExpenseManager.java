package Advanced_Java_Projects.JDBC;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class ExpenseManager {
    private static final JTextField expenseamountfield = new JTextField();
    private static final JTextField expensetypetextfield = new JTextField();
    private static final JTextField incomeamountfield = new JTextField();
    private static JTextField deletefield = new JTextField();
    static String url = "jdbc:mysql://localhost:3306/expensedb";
    static String query = "INSERT INTO expensetb(expensetype, expenseamount, incomeamount) VALUES(?,?,?)";
    static Connection con;

    public static void main(String[] args) throws SQLException {

        expenseframe();

    }



    private static void expenseframe()  {
        JFrame frame = new JFrame("Expense Calculator");


        JLabel titlelabel = new JLabel("Expense");
        titlelabel.setBounds(200,20,80,50);
        titlelabel.setForeground(Color.DARK_GRAY);
        frame.add(titlelabel);

        JLabel expensetypelabel = new JLabel("Enter Expense type:");
        expensetypelabel.setBounds(20,70,150,30);
        frame.add(expensetypelabel);

        expensetypetextfield.setBounds(160,70,130,30);
        frame.add(expensetypetextfield);

        JLabel expenseamountlabel = new JLabel("Enter Expense Amount:");
        expenseamountlabel.setBounds(20,130,150,30);
        frame.add(expenseamountlabel);

        expenseamountfield.setBounds(160,130,130,30);
        frame.add(expenseamountfield);

        JLabel incomeamountlabel = new JLabel("Enter Income Amount:");
        incomeamountlabel.setBounds(20,190,150,30);
        incomeamountlabel.setForeground(Color.GRAY);
        frame.add(incomeamountlabel);


        incomeamountfield.setBounds(160,190,130,30);
        frame.add(incomeamountfield);

        JButton savebutton = new JButton("Save");
        savebutton.setBounds(160,230,130,30);
        frame.add(savebutton);

        JButton clearButton = new JButton("Clear");
        clearButton.setBounds(160,260,130,30);
        frame.add(clearButton);

        JButton deleteButton = new JButton("Delete");
        deleteButton.setBounds(160,290,130,30);
        frame.add(deleteButton);

        JTextField idfield = new JTextField();
        idfield.setBounds(160,190,130,30);
        frame.add(idfield);

        JButton viewbutton=new JButton("View");
        viewbutton.setBounds(320,190,130,30);
        frame.add(viewbutton);


        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (savebutton.isVisible())
                {

                    //to hide the insert form
                    incomeamountlabel.setVisible(false);
                    incomeamountfield.setVisible(false);
                    expenseamountlabel.setVisible(false);
                    expenseamountfield.setVisible(false);
                    expensetypetextfield.setVisible(false);
                    expensetypelabel.setVisible(false);
                    savebutton.setVisible(false);
                    titlelabel.setText("Enter Id to delete Expense");
                    deletefield= new JTextField();
                    deletefield.setBounds(50, 60, 100, 40);
                    frame.add(deletefield);
                }
                else {

                    String deleteQuery = "delete from expencetb where id = ?";
                    try {
                        con =DriverManager.getConnection(url, "root", "Sheikh@7348");
                        PreparedStatement ps = con.prepareStatement(deleteQuery);
                        ps.setInt(1, Integer.parseInt(deletefield.getText()));
                        ps.executeUpdate();
                        JOptionPane.showMessageDialog(null,
                                "Record has been deleted");
                        expensetypelabel.setVisible(true);
                        expenseamountlabel.setVisible(true);
                        expensetypetextfield.setVisible(true);
                        expenseamountfield.setVisible(true);
                        savebutton.setVisible(true);
                        incomeamountlabel.setVisible(true);
                        incomeamountfield.setVisible(true);
                        deletefield.setVisible(false);
                        titlelabel.setText("Expense Calculator");
                    } catch (SQLException ex) {
                        throw new RuntimeException(ex);
                    }

                }
            }
        });


        viewbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (savebutton.isVisible())
                {

                    //to hide the insert form
                    incomeamountlabel.setVisible(false);
                    incomeamountfield.setVisible(false);
                    expenseamountlabel.setVisible(false);
                    expenseamountfield.setVisible(false);
                    expensetypetextfield.setVisible(false);
                    expensetypelabel.setVisible(false);
                    savebutton.setVisible(false);

                    titlelabel.setText("Enter Id to udpate Expense");
                    deletefield= new JTextField();
                    deletefield.setBounds(50, 60, 100, 40);
                    frame.add(deletefield);
                }
                else {
                    String deleteQuery = "Select * from expensetb where id = ?";
                    try {
                        con =DriverManager.getConnection(url, "root", "Sheikh@7348");
                        PreparedStatement ps = con.prepareStatement(deleteQuery);
                        ps.setInt(1, Integer.parseInt(deletefield.getText()));
                        ResultSet rs = ps.executeQuery();
                        while (rs.next())
                        {
                            System.out.print("ID: " + rs.getInt("id"));
                            System.out.print("Income amount: " + rs.getInt("incomeamount"));
                            System.out.print("Expense Type: " + rs.getString("expensetype"));
                            System.out.print("Expense Amount: " + rs.getInt("expenseamount"));
                            incomeamountfield.setText(String.valueOf(rs.getInt("incomeamount")));
                            expenseamountfield.setText(String.valueOf(rs.getInt("expenseamount")));
                            expensetypetextfield.setText(rs.getString("expensetype"));

                            JButton updateButton = new JButton("Update");
                            updateButton.setBounds(380,200,80,40);
                            frame.add(updateButton);
                            updateButton.addActionListener(new ActionListener() {
                                @Override
                                public void actionPerformed(ActionEvent e) {
                                    String updateQuery = "update expensetb set incomeamount = ?, expensetype = ?, expenseamount = ? where id = ?";
                                    try {
                                        PreparedStatement ps = con.prepareStatement(updateQuery);
                                        ps.setInt(1, Integer.parseInt(incomeamountfield.getText()));
                                        ps.setString(2, expensetypetextfield.getText());
                                        ps.setInt(3, Integer.parseInt(expenseamountfield.getText()));
                                        ps.setInt(4, 31);
                                        ps.executeUpdate();
                                    } catch (SQLException ex) {
                                        throw new RuntimeException(ex);
                                    }

                                }
                            });
                        }
                        JOptionPane.showMessageDialog(null,
                                "Record has been deleted");
                        expensetypelabel.setVisible(true);
                        expenseamountlabel.setVisible(true);
                        expensetypetextfield.setVisible(true);
                        expenseamountfield.setVisible(true);
                        savebutton.setVisible(true);
                        incomeamountlabel.setVisible(true);
                        incomeamountfield.setVisible(true);
                        deletefield.setVisible(false);
                        titlelabel.setText("Expense Calculator");
                    } catch (SQLException ex) {
                        throw new RuntimeException(ex);
                    }

                }
            }
        });


        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                clearform();
            }
        });

        savebutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    jdbcconnection();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        frame.setLayout(null);
        frame.setSize(500, 400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);




    }

    private static void jdbcconnection() throws SQLException {
        try  {
            con = DriverManager.getConnection(url, "root", "Sheikh@7348");
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, expensetypetextfield.getText());
            ps.setInt(2, Integer.parseInt(expenseamountfield.getText()));
            ps.setInt(3, Integer.parseInt(incomeamountfield.getText()));
            ps.executeUpdate();
            clearform();
            JOptionPane.showMessageDialog(null,"Data submitted");

            System.out.println("Connected ");

            //Design the Java UI for expense calculator
            //To insert the data into table.

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            con.close();
        }

    }

    private static void clearform() {
        expenseamountfield.setText("");
        incomeamountfield.setText("");
        expensetypetextfield.setText("");
    }

}
