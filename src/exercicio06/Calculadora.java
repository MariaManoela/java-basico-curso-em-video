package exercicio06;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.Year;

public class Calculadora {
    private JPanel panel1;
    private JButton btnCalcular;
    private JSpinner txtAnoNascimento;
    private JLabel lblIdade;
    private JLabel lblAnoAtual;

    public Calculadora() {
        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int anoSistema = Year.now().getValue();
                int anoNascimento = (int) txtAnoNascimento.getValue();
                int idade = anoSistema - anoNascimento;
                lblIdade.setText(Integer.toString(idade));
                lblAnoAtual.setText(Integer.toString(anoSistema));
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
