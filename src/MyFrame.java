import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MyFrame extends JFrame implements ActionListener {

    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        JRadioButton pizzaButton = new JRadioButton();
        JRadioButton hamburgerButton = new JRadioButton();
        JRadioButton hotdogButton = new JRadioButton();

        this.pack();
        this.setVisible(true);
    }



    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
