package exercicio08;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SuperCalculadora {
    private JPanel panel1;
    private JSpinner spinner1;
    private JButton calcularButton;
    private JLabel lblResto;
    private JLabel lblEelevadoCubo;
    private JLabel lblRaizQuad;
    private JLabel lblRaizCub;
    private JLabel lblValorAbs;

    public SuperCalculadora() {
        calcularButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int valor = (int) spinner1.getValue();
                int resto = valor % 2;
                int elevadoCubo = (int) Math.pow(valor, 3);
                float raizQuad = (float) Math.sqrt(valor);
                float raizCub = (float) Math.cbrt(valor);
                int valorAbs = Math.abs(valor);

                lblResto.setText(Integer.toString(resto));
                lblEelevadoCubo.setText(Integer.toString(elevadoCubo));
                lblRaizQuad.setText(String.format("%.2f", raizQuad));
                lblRaizCub.setText(String.format("%.2f", raizCub));
                lblValorAbs.setText(Integer.toString(valorAbs));
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setContentPane(new SuperCalculadora().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
