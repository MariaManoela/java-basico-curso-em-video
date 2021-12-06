package exercicio07;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OperadoresSwing {
    private JPanel panel1;
    private JButton btnDividir;
    private JTextField txtNumerador;
    private JTextField txtDenominador;
    private JLabel lblDivisao;
    private JLabel lblResto;

    public OperadoresSwing() {
        btnDividir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int numerador = Integer.parseInt(txtNumerador.getText());
                int denominador = Integer.parseInt(txtDenominador.getText());
                float divisao = numerador / denominador;
                float resto = numerador % denominador;

                lblDivisao.setText(Float.toString(divisao));
                lblResto.setText(Float.toString(resto));
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setContentPane(new OperadoresSwing().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
