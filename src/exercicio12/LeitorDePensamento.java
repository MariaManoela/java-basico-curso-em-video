package exercicio12;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LeitorDePensamento {
    private JPanel panel1;
    private JSpinner txtValor;
    private JButton btnPalpite;
    private JLabel lblFrase;

    public LeitorDePensamento() {
        lblFrase.setText("Vou pensar em um valor entre 1 e 5. Tente adivinhar!");
        btnPalpite.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            double n = 1 + Math.random() * (6-1);
            int valor = (int) n;
            int num = Integer.parseInt(txtValor.getValue().toString());

            String f1 = "ACERTOU!";
            String f2 = "ERROU! Eu pensei no valor " + valor;
            String resultado = (valor == num)?f1:f2;

            lblFrase.setText(resultado);
            }
        });
    }

    public static void main(String[] args) {
//        new LeitorDePensamento();
        JFrame frame = new JFrame();
        frame.setContentPane(new LeitorDePensamento().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
