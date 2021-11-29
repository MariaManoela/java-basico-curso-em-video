package exercicio02;

import java.awt.*;

public class ResolucaoTela {
    public static void main(String[] args) {
        Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
        System.out.println("A resolução da tela é: " + tela.getWidth() + " X " + tela.getHeight());
    }
}
