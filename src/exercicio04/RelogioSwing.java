package exercicio04;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class RelogioSwing {
    private JButton buttonHora;
    private JLabel labelHora;
    private JPanel panel1;

    public RelogioSwing() {
        buttonHora.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Date relogio = new Date();
                labelHora.setText(relogio.toString());
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setContentPane(new RelogioSwing().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
