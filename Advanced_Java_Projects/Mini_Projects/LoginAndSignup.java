package Advanced_Java_Projects.Mini_Projects;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
public class LoginAndSignup extends JFrame{
    private static final JLabel loginusername = new JLabel("Username: ");
    private static final JLabel loginPasswowrd = new JLabel("Password: ");
    private static final JTextField loginField = new JTextField();
    private static final JPasswordField passwordField = new JPasswordField();
    private static final JButton loginButton = new JButton("Login");
    private static final JButton signupButton = new JButton("Signup");
    private static final JButton forgotButton = new JButton("forgot Password");
    private static final JButton clearButton = new JButton("Clear");
    private static final String url = "jdbc:mysql://localhost:3306/login";
    static Connection con;
    public static void main(String[] args) {
        JFrame frame = new JFrame("Login Form");

        loginpage(frame);

        frame.setVisible(true);
        frame.setLayout(null);
        frame.setSize(500,400);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    private static void loginpage(JFrame frame) {

        loginusername.setBounds(100,80,70,25);
        frame.add(loginusername);

        loginPasswowrd.setBounds(100,110,100,25);
        frame.add(loginPasswowrd);

        loginField.setBounds(170,80,100,25);
        frame.add(loginField);

        passwordField.setBounds(170,110,100,25);
        frame.add(passwordField);

        loginButton.setBounds(175,150,90,25);
        frame.add(loginButton);

        signupButton.setBounds(300,150,90,25);
        frame.add(signupButton);

        forgotButton.setBounds(170,180,100,25);
        frame.add(forgotButton);

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                String query = "SELECT * FROM logintb where username=? and password=?";
                String url = "jdbc:mysql://localhost:3306/login";
                try {
                    String username= loginField.getText();
                    String password = new String(passwordField.getPassword());
                    con = DriverManager.getConnection(url,"root","Sheikh@7348");
                        PreparedStatement pst =con.prepareStatement(query);
                        pst.setString(1, username);
                        pst.setString(2, password);
                        ResultSet rs =pst.executeQuery();
                    if(rs.next()){
                        JOptionPane.showMessageDialog(null,"Logged in");

                        clearfield();
                        frame.dispose();
                    } else {
                        JOptionPane.showMessageDialog(null,"Wrong Credentials");
                        clearfield();

                    }
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        signupButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                frame.dispose();
                JFrame frame1 = new JFrame("Signup");

                loginusername.setBounds(100,80,70,25);
                frame1.add(loginusername);

                loginPasswowrd.setBounds(100,110,100,25);
                frame1.add(loginPasswowrd);

                loginField.setBounds(170,80,100,25);
                frame1.add(loginField);

                passwordField.setBounds(170,110,100,25);
                frame1.add(passwordField);

                signupButton.setBounds(175,150,90,25);
                frame1.add(signupButton);

                forgotButton.setBounds(170,180,100,25);
                frame1.add(forgotButton);

                signupButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent actionEvent) {
                        try {
                            String url = "jdbc:mysql://localhost:3306/login";
                            Connection con = DriverManager.getConnection(url, "root", "Sheikh@7348");

                            String query = "INSERT INTO logintb(username, password) VALUES(?,?)";
                            try  {
                                con = DriverManager.getConnection(url, "root", "Sheikh@7348");
                                PreparedStatement ps = con.prepareStatement(query);
                                ps.setString(1, loginField.getText());
                                ps.setInt(2, Integer.parseInt(passwordField.getText()));
                                ps.executeUpdate();
                                clearfield();
                                JOptionPane.showMessageDialog(null,"Data submitted");


                                System.out.println("Connected ");

                                //Design the Java UI for expense calculator
                                //To insert the data into table.

                            } catch (SQLException e) {
                                throw new RuntimeException(e);
                            } finally {
                                con.close();
                            }

                        } catch (SQLException e) {
                            throw new RuntimeException(e);
                        }
                    }
                });

                frame1.setVisible(true);
                frame1.setLayout(null);
                frame1.setSize(500,400);
                frame1.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

            }
        });
    }
    private static void clearfield() {
        passwordField.setText("");
        passwordField.setText("");
    }

}
