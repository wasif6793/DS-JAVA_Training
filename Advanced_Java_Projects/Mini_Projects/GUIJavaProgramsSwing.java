package Advanced_Java_Projects;

import javax.security.auth.callback.TextInputCallback;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIJavaProgramsSwing {
    public static void main(String[] args) {



        // To create a frame using swing in java
        JFrame frame = new JFrame("Swing Demo BMI Calculator");


        //Create UI component for BMI calculator
        JLabel heightlabel = new JLabel("Enter your Height(cm):");
        JLabel weightlabel = new JLabel("Enter your weight(kg):");

        JLabel bmilabel = new JLabel();

        JTextField heightfield = new JTextField();

        JTextField weightfield = new JTextField();

        JButton bmibutton = new JButton("Calculate BMI");

        // to set the size and position of ui components
        heightlabel.setBounds(30,30,140,40);
        heightfield.setBounds(30,75,100,30);

        weightlabel.setBounds(180,30,140,40);
        weightfield.setBounds(180,75,100,30);

        bmibutton.setBounds(100,160,120,40);

        bmilabel.setBounds(100,120,140,40);

        // to attach the label to frame
        frame.add(heightlabel);
        frame.add(heightfield);
        frame.add(weightlabel);
        frame.add(weightfield);
        frame.add(bmibutton);
        frame.add(bmilabel);

        // to click on the bmi button

        bmibutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                float heightval = Integer.parseInt(heightfield.getText());
                float weightval = Integer.parseInt(weightfield.getText());
                float bmival = weightval/(heightval * heightval) * 10000;

                if(bmival < 18.5){
                    bmilabel.setText("You are Underweight.");

                } else if(bmival > 18.5 && bmival < 24.9){
                    bmilabel.setText("You are normal.");
                } else if(bmival > 24.9 && bmival < 29.9){
                    bmilabel.setText("You are Overweight.");
                } else {
                    bmilabel.setText("Obesity.");
                }



            }
        });

        // To fill the default layout
        frame.setLayout(null);

        // to set the layout of the frame
        frame.setSize(340,280);

        //To visible a frame on screen
        frame.setVisible(true);

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
