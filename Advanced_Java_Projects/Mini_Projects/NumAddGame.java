package Advanced_Java_Projects.Mini_Projects;

import javax.swing.*;

public class NumAddGame {
    public static void main(String[] args) {
        game();
    }

    static void game() {

       JFrame frame = new JFrame("Addition game");


        JButton submitbutton = new JButton("Submit");

        JTextField inputframe = new JTextField();

        JLabel num1 = new JLabel("num1");
        JLabel num2 = new JLabel("num2");
        JLabel operator = new JLabel("+");
        JLabel equalsLabel = new JLabel("=");

        JLabel timerlabel = new JLabel("TImer:");
        JLabel scorelabel = new JLabel("Score:");

        submitbutton.setBounds(150,150,110,40);
        num1.setBounds(100,100,50,50);
        num2.setBounds(160,100,50,50);
        operator.setBounds(140,100,50,50);
        inputframe.setBounds(230,110,80,30);
        equalsLabel.setBounds(200,100,50,50);
        timerlabel.setBounds(230,80,60,30);
        scorelabel.setBounds(230,60,60,30);



        frame.add(submitbutton);
        frame.add(inputframe);
        frame.add(num1);
        frame.add(num2);
        frame.add(operator);
        frame.add(equalsLabel);
        frame.add(timerlabel);
        frame.add(scorelabel);


        frame.setLayout(null);
        frame.setSize(430,320);
        frame.setVisible(true);

    }

}
