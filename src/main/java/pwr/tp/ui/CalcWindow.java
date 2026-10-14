package pwr.tp.ui;

import java.awt.*;
import java.awt.event.*;

public class CalcWindow {
    Frame fr = new Frame("Calc");
    Panel inputs = new Panel(
            new FlowLayout(
                    FlowLayout.CENTER,
                    8,
                    4
            )
    );

    Panel okay = new Panel();
    public CalcWindow(TextField first, TextField second, Button add, Label result) {
        fr.setLayout(new GridLayout(2, 1, 0, 8));
        inputs.add(first);
        inputs.add(new Label("+"));
        inputs.add(second);
        inputs.add(new Label("="));
        inputs.add(result);
        fr.add(inputs);

        okay.add(add);
        fr.add(okay);

        fr.pack();
        fr.setVisible(true);
        fr.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                fr.dispose();
            }
        });
    }
}
