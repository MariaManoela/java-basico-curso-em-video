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
                float resto = valor % 2;
                float elevadoCubo = (float) Math.pow(valor, 3);
                float raizQuad = (float) Math.sqrt(valor);
                float raizCub = (float) Math.cbrt(valor);
                float valorAbs = Math.abs(valor);

                lblResto.setText(Float.toString(resto));
                lblEelevadoCubo.setText(Float.toString(elevadoCubo));
                lblRaizQuad.setText(Float.toString(raizQuad));
                lblRaizCub.setText(Float.toString(raizCub));
                lblValorAbs.setText(Float.toString(valorAbs));
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
