package exercicio02;

import java.util.Locale;

public class LinguagemDoSistema {
    public static void main(String[] args) {
        Locale linguagem = Locale.getDefault();
        System.out.println("A linguagem do sistema é: " + linguagem.getDisplayLanguage());
        System.out.println("A linguagem do sistema é: " + linguagem);
    }
}
