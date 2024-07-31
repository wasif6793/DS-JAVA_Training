package Advanced_Java_Projects.JavaF;

import javax.swing.*;
import java.awt.*;

public class JPanelExample {
    public static void main(String[] args) {
        // Create a new JFrame
        JFrame frame = new JFrame("JPanel Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Create a JPanel with a FlowLayout
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        // Add components to the JPanel
        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        JButton button3 = new JButton("Button 3");

        panel.add(button1);
        panel.add(button2);
        panel.add(button3);

        // Add the JPanel to the JFrame
        frame.add(panel);

        // Make the JFrame visible
        frame.setVisible(true);
    }
}
