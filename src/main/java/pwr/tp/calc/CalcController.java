package pwr.tp.calc;

import pwr.tp.ui.CalcWindow;
import java.awt.*;
import java.awt.event.*;

public class CalcController {
    TextField first = new TextField(8);
    TextField second = new TextField(8);
    Button add = new Button("Dodaj");
    Label result = new Label("        ");
    public CalcController() {
        add.addActionListener(e -> {
            double firstVal,
                    secondVal;
            try {
                firstVal = Double.parseDouble(first.getText());
                secondVal = Double.parseDouble(second.getText());
            }
            catch (NumberFormatException err) {
                System.out.println("Podaj poprawne wartości");
                return;
            }
            Calculator calculator = new Calculator(
                    firstVal,
                    secondVal
            );
            result.setText(calculator.getAnswer());
        });
        new CalcWindow(
                first,
                second,
                add,
                result
        );

    }
}
