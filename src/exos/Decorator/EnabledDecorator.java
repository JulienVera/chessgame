package exos.Decorator;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


class EnabledDecorator extends Decorator {

    private JComponent decorateComp;
    private static JComponent savedComp;

    EnabledDecorator(JComponent c) {
        super(c);
        decorateComp = c;

        c.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                decorateComp.setEnabled(false);
                savedComp.setEnabled(true);
                savedComp = decorateComp;
            }
        });
    }

    void setDisabled() {
        decorateComp.setEnabled(false);
        savedComp = decorateComp;
    }
}
