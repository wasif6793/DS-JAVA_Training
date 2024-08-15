package Advanced_Java_Projects.Mini_Projects;

import com.mongodb.client.MongoClients;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.Random;
import com.mongodb.client.MongoClient;
import org.bson.Document;
import javax.swing.JComboBox;

public class HotelManagement {

    private static final JLabel loginusername = new JLabel("Username: ");
    private static final JLabel loginPasswowrd = new JLabel("Password: ");
    private static final JTextField loginField = new JTextField();
    private static final JPasswordField passwordField = new JPasswordField();
    private static final JButton loginButton = new JButton("Login");
    private static final JButton signupButton = new JButton("Signup");
    private static final JButton forgotButton = new JButton("forgot Password");
    private static final JButton clearButton = new JButton("Clear");
    private static final String url = "jdbc:mysql://localhost:3306/login";
    private static final JFrame frame = new JFrame("Login Form");
    private static final JFrame frame1 = new JFrame("Signup");
    private static final JFrame frame2 = new JFrame("Hotel Boooking");
    static Connection con;

    static {
        try {
            con = DriverManager.getConnection(url, "root", "Sheikh@7348");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    ;
    public static void main(String[] args) {

        javaframelogin();
    }

    private static void javaframesignup() {

            ImageIcon background = new ImageIcon("C:\\Users\\wasif\\Downloads\\signup.jpg");
            JLabel backgroundLabel = new JLabel(background);
            frame1.setContentPane(backgroundLabel);

            loginusername.setBounds(130,110,70,25);
            loginusername.setForeground(Color.WHITE);
            frame1.add(loginusername);

            loginPasswowrd.setBounds(130,160,100,20);
            loginPasswowrd.setForeground(Color.WHITE);
            frame1.add(loginPasswowrd);

            loginField.setBounds(130,130,230,30);
            frame1.add(loginField);

            passwordField.setBounds(130,177,230,30);
            frame1.add(passwordField);

            signupButton.setBounds(130,220,230,30);
            frame1.add(signupButton);

            signupButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent actionEvent) {
                    try {
                        String url = "jdbc:mysql://localhost:3306/login";
                        Connection con = DriverManager.getConnection(url, "root", "Sheikh@7348");
                        String query = "INSERT INTO logintb(username, password) VALUES(?,?)";


                        con = DriverManager.getConnection(url, "root", "Sheikh@7348");
                        PreparedStatement ps = con.prepareStatement(query);
                        ps.setString(1, loginField.getText());
                        ps.setString(2, passwordField.getText());
                        ps.executeUpdate();
                        frame1.dispose();
                        javaframelogin();
                        JOptionPane.showMessageDialog(null, "Signed UP!!");
                        System.out.println("Connected");

                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, "Already Exist");
                        clearfield();
                        hotelbookingframe();
                        throw new RuntimeException(e);
                    } finally {
                        try {
                            con.close();
                        } catch (SQLException e) {
                            throw new RuntimeException(e);
                        }
                    }

                }
            });

            frame1.setVisible(true);
            frame1.setLayout(null);
            frame1.setSize(500,400);
            frame1.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    private static void hotelbookingframe() {

        ImageIcon background = new ImageIcon("C:\\Users\\wasif\\Downloads\\hotelback.png");
        JLabel backgroundLabel = new JLabel(background);
        frame2.setContentPane(backgroundLabel);

        JLabel hotelname = new JLabel("Hotel Booking");
        JLabel namelabel = new JLabel("Name:");
        JLabel pnolabel = new JLabel("Phone No:");
        JLabel emaillabel =new JLabel("E-mail: ");
        JLabel agelabel = new JLabel("Age:");
        JLabel genderlabel = new JLabel("Gender:");
        JLabel typeroomlabel = new JLabel("Room Pref:");
        JLabel adultslabel = new JLabel("NO. Of Adults:");
        JLabel childlabel = new JLabel("No. Of Children:");
        JLabel citylabel = new JLabel("Select City:");
        JLabel pinlabel = new JLabel("Pincode:");
        JLabel cinlabel =new JLabel("Check in Date:");
        JLabel coutlabel = new JLabel("Check Out Date");
        JLabel bookroomlabel = new JLabel("Room book:");
        JLabel abc = new JLabel(".");

        var namefield = new JTextField("");
        var pnofield = new JTextField("");
        var emailfield = new JTextField("");
        var agefield = new JTextField("");

        String genderpref[] = {"Male","Female","Other"};
        JComboBox gencombo = new JComboBox(genderpref);

        String roompref[] = {"Deluxe", "Suite"};
        JComboBox roomcombo = new JComboBox(roompref);

        JButton submitbutton = new JButton("Submit");
        JButton reset = new JButton("Reset");

        JTextField adfield = new JTextField("");
        JTextField chfield = new JTextField("");
        JTextField cityfield = new JTextField("");
        JTextField pinfield = new JTextField("");
        JTextField cinfield = new JTextField("");
        JTextField coutfield = new JTextField("");

        String roomnum[] = {"1","2","3","4"};
        JComboBox roomnumcombo = new JComboBox(roomnum);

        hotelname.setBounds(100,40,700,70);
        hotelname.setFont(new Font("Arial", Font.PLAIN, 40));

        namelabel.setBounds(80,120,100,30);
        pnolabel.setBounds(80,155,100,30);
        emaillabel.setBounds(80,190,100,30);
        agelabel.setBounds(80,225,100,30);
        genderlabel.setBounds(80,260,100,30);
        typeroomlabel.setBounds(80,300,100,30);

        namefield.setBounds(180,130,100,20);
        pnofield.setBounds(180,165,100,20);
        emailfield.setBounds(180,200,100,20);
        agefield.setBounds(180,235,100,20);
        gencombo.setBounds(180,270,100,20);
        roomcombo.setBounds(180,305,100,20);

        adultslabel.setBounds(300,120,100,30);
        childlabel.setBounds(300,155,100,30);
        citylabel.setBounds(300,190,100,30);
        pinlabel.setBounds(300,225,100,30);
        cinlabel.setBounds(300,260,100,30);
        coutlabel.setBounds(300,300,100,30);
        bookroomlabel.setBounds(300,335,100,30);

        adfield.setBounds(400,130,100,20);
        chfield.setBounds(400,165,100,20);
        cityfield.setBounds(400,200,100,20);
        pinfield.setBounds(400,235,100,20);
        cinfield.setBounds(400,270,100,20);
        coutfield.setBounds(400,305,100,20);
        roomnumcombo.setBounds(400,340,100,20);

        submitbutton.setBounds(380,400,100,30);
        reset.setBounds(280,400,100,30);

        submitbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                var client = MongoClients.create("mongodb://localhost:27017/");
                var database = client.getDatabase("HotelBookingDB");
                System.out.println();
                System.out.println("\n connection ban gya \n \n \n");

                var col = database.getCollection("BookingProject");

                var doc = new Document();

                Random rn = new Random();
                doc.append("reservationId",rn.nextInt(999999));
                doc.append("Name",namefield.getText());
                doc.append("phoneNo",pnofield.getText());
                doc.append("emailId",emailfield.getText());
                doc.append("age",agefield.getText());
                doc.append("gender",gencombo.getSelectedItem().toString());
                doc.append("roomPrefernce",roomcombo.getSelectedItem().toString());
                doc.append("noOfAdults",adfield.getText());
                doc.append("noOfChildren",chfield.getText());
                doc.append("city",cityfield.getText());
                doc.append("pinCode",pinfield.getText());
                doc.append("checkinDate",cinfield.getText());
                doc.append("checkoutDate",coutfield.getText());
                doc.append("roomBook",roomnumcombo.getSelectedItem().toString());

                col.insertOne(doc);
                namefield.setText("");
                pnofield.setText("");
                emailfield.setText("");
                agefield.setText("");
                adfield.setText("");
                chfield.setText("");
                cityfield.setText("");
                pinfield.setText("");
                cinfield.setText("");
                coutfield.setText("");

            }
        });

        reset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                namefield.setText("");
                pnofield.setText("");
                emailfield.setText("");
                agefield.setText("");
                adfield.setText("");
                chfield.setText("");
                cityfield.setText("");
                pinfield.setText("");
                cinfield.setText("");
                coutfield.setText("");

            }
        });

        frame2.add(namefield);
        frame2.add(pnofield);
        frame2.add(emailfield);
        frame2.add(agefield);

        frame2.getContentPane().add(roomcombo);
        frame2.getContentPane().add(gencombo);

        frame2.add(adfield);
        frame2.add(chfield);
        frame2.add(cityfield);
        frame2.add(pinfield);
        frame2.add(cinfield);
        frame2.add(coutfield);

        frame2.getContentPane().add(roomnumcombo);

        frame2.add(hotelname);
        frame2.add(namelabel);
        frame2.add(pnolabel);
        frame2.add(emaillabel);
        frame2.add(agelabel);
        frame2.add(genderlabel);
        frame2.add(typeroomlabel);
        frame2.add(adultslabel);
        frame2.add(childlabel);
        frame2.add(citylabel);
        frame2.add(pinlabel);
        frame2.add(cinlabel);
        frame2.add(coutlabel);
        frame2.add(bookroomlabel);

        frame2.add(submitbutton);
        frame2.add(reset);
        frame2.add(abc);

        frame2.pack();
        frame2.setVisible(true);
        frame2.setLayout(null);
        frame2.setSize(700,600);
        frame2.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    private static void javaframelogin() {

        ImageIcon background = new ImageIcon("C:\\Users\\wasif\\Downloads\\login.jpg");
        JLabel backgroundLabel = new JLabel(background);
        frame.setContentPane(backgroundLabel);

            loginusername.setBounds(130,110,70,25);
            loginusername.setForeground(Color.WHITE);
            frame.add(loginusername);

            loginPasswowrd.setBounds(130,160,100,20);
            loginPasswowrd.setForeground(Color.WHITE);
            frame.add(loginPasswowrd);

            loginField.setBounds(130,130,230,30);
            frame.add(loginField);

            passwordField.setBounds(130,177,230,30);
            frame.add(passwordField);

            loginButton.setBounds(130,220,230,32);
            frame.add(loginButton);

            signupButton.setBounds(130,260,230,30);
            frame.add(signupButton);

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
                            hotelbookingframe();

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
                public void actionPerformed(ActionEvent actionEvent){
                    javaframesignup();
                }
            });

        frame.setVisible(true);
        frame.setLayout(null);
        frame.setSize(500,400);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        }
    private static void clearfield() {
        passwordField.setText("");
        passwordField.setText("");
    }
    }


