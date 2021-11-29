package exercicio03;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OlaMundo {
    private JButton button;
    private JPanel panel1;
    private JTextField text;

    public OlaMundo() {
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Olá. Mundo!");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("OlaMundo");
        frame.setContentPane(new OlaMundo().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
