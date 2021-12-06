package exercicio07;

import exercicio04.RelogioSwing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora {
    private JPanel panel1;
    private JButton btnCalcular;
    private JSpinner txtAnoNascimento;
    private JLabel lblIdade;

    public Calculadora() {
        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int anoNascimento = (int) txtAnoNascimento.getValue();
                int idade = 2021 - anoNascimento;
                lblIdade.setText(Integer.toString(idade));
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setContentPane(new Calculadora().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
