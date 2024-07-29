package Advanced_Java_Projects.Mini_Projects;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

public class GUIOtpGenerator {
    public static void main(String[] args) {
        otpgen();
    }

    static void otpgen(){

        JFrame frame = new JFrame();

        JLabel otplabel = new JLabel();

        JButton otpbutton = new JButton("Generate OTP");

        otpbutton.setBounds(100,80,120,40);

        otplabel.setBounds(90,30,190,40);

        frame.add(otpbutton);
        frame.add(otplabel);

        otpbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                String val = "1234567890";

                Random rn = new Random();

                StringBuilder sb = new StringBuilder();

                for (int i = 0; i < 6; i++) {

                    int num = rn.nextInt(val.length());

                    sb.append(val.charAt(num));

                }
                String str = sb.toString();

                otplabel.setText("Generated OTP: " + str);


            }
        });




        frame.setLayout(null);
        frame.setSize(340,280);
        frame.setVisible(true);
    }

}
