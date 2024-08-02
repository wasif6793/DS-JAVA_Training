package Advanced_Java_Projects.JDBC;

import javax.swing.*;
import java.awt.*;

public class JDBCGUIProgram {

    private static JLabel snoLabel = new JLabel("Enter Sno: ");
    private static JLabel nameLabel = new JLabel("Enter name: ");
    private static JLabel mobileLabel = new JLabel("Enter Mobile no.: ");
    private static JLabel emaillabel = new JLabel("Enter email: ");
    private static JLabel addressLabel = new JLabel("Enter Address: ");
    private static JLabel techLabel = new JLabel("Enter Technology: ");
    private static JButton submitButton = new JButton();
    private static JTextField snofield = new JTextField();
    private static JTextField namefield = new JTextField();
    private static JTextField mobilefield = new JTextField();
    private static JTextField emailfield = new JTextField();
    private static JTextField addressfield = new JTextField();private static JTextField techfield = new JTextField("tech");



    public static void main(String[] args) {

        JFrame frame = new JFrame("JDBC connectivity");

        frame.setLayout(new GridLayout(6, 1));

        frame.add(new JLabel("Sno: "));
        frame.add(new JLabel("Name: "));
        frame.add(new JLabel("Mobile No:"));
        frame.add(new JLabel("Email: "));
        frame.add(new JLabel("Address: "));
        frame.add(new JLabel("Technology: "));
        frame.add(snofield);
        frame.add(snoLabel);
        frame.add(nameLabel);
        frame.add(namefield);
        frame.add(mobilefield);
        frame.add(mobileLabel);
        frame.add(emailfield);
        frame.add(emaillabel);
        frame.add(addressfield);
        frame.add(addressLabel);
        frame.add(techLabel);
        frame.add(techfield);

        frame.setVisible(true);
        frame.setSize(300,200);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        guijdbc();
    }

    private static void guijdbc() {


    }
}
