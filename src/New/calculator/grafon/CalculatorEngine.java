package New.calculator.grafon;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorEngine implements ActionListener {
    NewCalculator parent;

    char selectedAction= ' '; //+,-,/,*/

    double currentResult= 0;


    CalculatorEngine(NewCalculator parent) {
        this.parent = parent;
    }

    @Override
    public void actionPerformed( ActionEvent e){

        JButton clickedButton= (JButton)e.getSource();
        String displayField= parent.displayField.getText();
        double displayValue= 0;
        if(!"".equals(displayField)){
            displayValue= Double.parseDouble(displayField);
        }
        Object src=e.getSource();
        if (src== parent.buttonPlus) {
            selectedAction= '+';
            currentResult= displayValue;
            parent.displayField.setText("");

        }
        else if(src==parent.ButtonDivide){
            selectedAction='/';
            currentResult= displayValue;
            parent.displayField.setText("");
        }
        else if(src==parent.ButtonMultiply){
            selectedAction= '*';
            currentResult= displayValue;
            parent.displayField.setText("");
        }
        else if(src==parent.ButtonMinus){
            selectedAction = '-';
            currentResult= displayValue;
            parent.displayField.setText("");
        }
        else if(src==parent.buttonEqual){

            if(selectedAction=='+'){
            selectedAction= '=';
            currentResult += displayValue;
            parent.displayField.setText("" + currentResult);
            }
            else if(selectedAction== '-'){
                currentResult -= displayValue;
                parent.displayField.setText("" + currentResult);
            }
            else if(selectedAction=='/'){
                currentResult /= displayValue;
                parent.displayField.setText("" + currentResult);
            }
            else if(selectedAction=='*'){
                currentResult *=displayValue;
                parent.displayField.setText("" + currentResult);
            }
        }
        else {
            String clickedButtonLabel= clickedButton.getText();
            parent.displayField.setText(displayField+clickedButtonLabel);
        }

    }
}
