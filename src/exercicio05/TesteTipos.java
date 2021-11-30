package exercicio05;

public class TesteTipos {
    public static void main(String[] args) {
        int idade = 21;
        String valor = Integer.toString(idade);
        System.out.println(valor);

        String valor2 = "34";
        int idade2 = Integer.parseInt(valor2);
        System.out.println(idade2);

        String valor3 = "50";
        float idade3 = Float.parseFloat(valor3);
        System.out.println(valor3);
    }
}
