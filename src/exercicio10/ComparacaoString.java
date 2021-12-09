package exercicio10;

public class ComparacaoString {
    public static void main(String[] args) {
        String nome1 = "Manu";
        String nome2 = "Manu";
        String nome3 = new String("Manu");
        String resultado = (nome1.equals(nome3))?"igual":"diferente";
        System.out.println(resultado);
    }
}
