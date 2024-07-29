package Advanced_Java_Projects.Mini_Projects;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUICurrencyConvertor {
    public static void main(String[] args) {
        currencyconvertor();

    }

    static void currencyconvertor(){
        JFrame frame = new JFrame();

        JLabel inrlabel = new JLabel("Write in INR:");
        JLabel usdlabel = new JLabel("Write in USD:");

        JLabel conlabel = new JLabel();

        JTextField inrfield = new JTextField();

        JTextField usdfield = new JTextField();

        JButton currencybutton = new JButton("Convert");

        // to set the size and position of ui components
        inrlabel.setBounds(30,30,140,40);
        inrfield.setBounds(30,75,100,30);

        usdlabel.setBounds(180,30,140,40);
        usdfield.setBounds(180,75,100,30);

        currencybutton.setBounds(100,170,120,40);

        conlabel.setBounds(100,120,240,40);

        // to attach the label to frame
        frame.add(inrlabel);
        frame.add(inrfield);
        frame.add(usdlabel);
        frame.add(usdfield);
        frame.add(currencybutton);
        frame.add(conlabel);

        currencybutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (!inrfield.getText().isEmpty()
                        && usdfield.getText().isEmpty())
                {
                    float rs = Float.parseFloat(inrfield.getText());
                    float inrToUsd = (float) (rs/83.73);
                    conlabel.setText("INR to usd :"+ String.valueOf(inrToUsd));
                } else if (inrfield.getText().isEmpty()
                        && !usdfield.getText().isEmpty()) {
                    float usd = Float.parseFloat(usdfield.getText());
                    float usdToInr = (float) (usd* 83.73);
                    conlabel.setText("Usd to Inr :" + usdToInr);
                } else if (inrfield.getText().isEmpty()
                        && usdfield.getText().isEmpty()) {
                    conlabel.setText("Enter atlease one amount to convert :" );
                }
                else {
                    float rs = Float.parseFloat(inrfield.getText());
                    float inrToUsd = (float) (rs/83.73);
                    float usd = Float.parseFloat(usdfield.getText());
                    float usdToInr = (float) (usd* 83.73);
                    conlabel.setText("In usd :"+ String.valueOf(inrToUsd) +
                            " ::  In INR"+ usdToInr
                    );

                }


            }
        });




        // To fill the default layout
        frame.setLayout(null);

        // to set the layout of the frame
        frame.setSize(340,280);

        //To visible a frame on screen
        frame.setVisible(true);
    }
}
