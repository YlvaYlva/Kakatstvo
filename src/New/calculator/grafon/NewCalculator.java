package New.calculator.grafon;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class NewCalculator {
    JPanel myPanel;
    JTextField displayField;
    JButton button0= new JButton("0");
    JButton button1= new JButton("1");
    JButton button2= new JButton("2");
    JButton button3= new JButton("3");
    JButton button4= new JButton("4");
    JButton button5= new JButton("5");
    JButton button6= new JButton("6");
    JButton button7= new JButton("7");
    JButton button8= new JButton("8");
    JButton button9= new JButton("9");
    JButton buttonPoint= new JButton(".");
    JButton buttonEqual= new JButton("=");
    JButton ButtonMinus= new JButton("-");
    JButton buttonPlus= new JButton("+");
    JButton ButtonMultiply= new JButton("*");
    JButton ButtonDivide= new JButton("/");

    JPanel panel1= new JPanel();
    JTextField getDisplayField= new JTextField(30);

    NewCalculator(){
        myPanel = new JPanel();
        BorderLayout bl= new BorderLayout();
        myPanel.setLayout(bl);
        displayField= new JTextField(30);
        myPanel.add("North", displayField);
        button0= new JButton("0");
        button1= new JButton("1");
        button2= new JButton("2");
        button3= new JButton("3");
        button4= new JButton("4");
        button5= new JButton("5");
        button6= new JButton("6");
        button7= new JButton("7");
        button8= new JButton("8");
        button9= new JButton("9");
        buttonPoint= new JButton(".");
        buttonEqual= new JButton("=");

        panel1= new JPanel();
        GridLayout gl= new GridLayout(4,3);
        panel1.setLayout(gl);
        panel1.add(button0);
        panel1.add(button1);
        panel1.add(button2);
        panel1.add(button3);
        panel1.add(button4);
        panel1.add(button5);
        panel1.add(button6);
        panel1.add(button7);
        panel1.add(button8);
        panel1.add(button9);
        panel1.add(buttonPoint);
        panel1.add(buttonEqual);


        myPanel.add("Center", panel1);

        JPanel panel2= new JPanel();
        GridLayout gl2= new GridLayout(4,1);

        panel2.setLayout(gl2);
        panel2.add(ButtonMinus);
        panel2.add(ButtonDivide);
        panel2.add(ButtonMultiply);
        panel2.add(buttonPlus);

        myPanel.add("East", panel2);
        


        JFrame frame= new JFrame("Kakalculator");

        frame.setContentPane(myPanel);

        frame.pack();

        frame.setVisible(true);

        CalculatorEngine calculatorEngine= new CalculatorEngine(this);
        button0.addActionListener(calculatorEngine);
        button1.addActionListener(calculatorEngine);
        button2.addActionListener(calculatorEngine);
        button3.addActionListener(calculatorEngine);
        button4.addActionListener(calculatorEngine);
        button5.addActionListener(calculatorEngine);
        button6.addActionListener(calculatorEngine);
        button7.addActionListener(calculatorEngine);
        button8.addActionListener(calculatorEngine);
        button9.addActionListener(calculatorEngine);
        buttonPoint.addActionListener(calculatorEngine);
        buttonEqual.addActionListener(calculatorEngine);
        buttonPlus.addActionListener(calculatorEngine);
        ButtonMinus.addActionListener(calculatorEngine);
        ButtonDivide.addActionListener(calculatorEngine);
        ButtonMultiply.addActionListener(calculatorEngine);

    }
    public static void main(String[] args){
        NewCalculator calc= new NewCalculator();








    }



}
