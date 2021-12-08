package exercicio07;

public class OperadoresAritmeticos {
    public static void main(String[] args) {
        int n1 = 3;
        int n2 = 5;
        float media = (n1 + n2)/2;
        System.out.println("A média é: " + media);

//        INCREMENTO / DECREMENTO
        int numero = 10;
        int valor = 4 + numero--;
        System.out.println(valor);
        System.out.println(numero);

//        OPERADORES DE ATRIBUIÇÃO
        int x = 4;
        x += 2; // x = x + 2
        System.out.println(x);
    }
}
