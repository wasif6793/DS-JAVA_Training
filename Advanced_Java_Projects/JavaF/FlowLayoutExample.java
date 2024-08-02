package Advanced_Java_Projects.JavaF;

import javax.swing.*;
import java.awt.*;

public class FlowLayoutExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("FlowLayout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        JPanel panel2 = new JPanel();
        panel2.setLayout(new GridLayout());
        panel2.setBounds(0,100,280,30);

        panel2.add(new JButton("Button 1"));
        panel2.add(new JButton("Button 2"));
        panel2.add(new JButton("Button 3"));

        panel.add(new JButton("Button 1"));
        panel.add(new JButton("Button 2"));
        panel.add(new JButton("Button 3"));

        frame.add(panel2);
        frame.add(panel);
        frame.setVisible(true);
    }
}
