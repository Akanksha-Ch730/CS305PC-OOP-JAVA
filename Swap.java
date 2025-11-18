import java.awt.*;
import java.awt.event.*;

class Swap {
    public static void main(String arg[]) {

        Frame f = new Frame("my frame");

        Button b = new Button("Ok");

        Label l1 = new Label("FIRST");
        Label l2 = new Label("SECOND");

        TextField t1 = new TextField(10);
        TextField t2 = new TextField(10);

        f.setLayout(new FlowLayout());

        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(t2);
        f.add(b);

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                String temp = t1.getText();
                t1.setText(t2.getText());
                t2.setText(temp);
            }
        });

        f.setSize(300, 300);
        f.setVisible(true);
    }
}
