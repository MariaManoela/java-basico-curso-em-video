package exercicio05;

import java.util.Scanner;

public class TiposPrimitivos {
    public static void main(String[] args) {
//        SAÍDA DE DADOS
        String nome = "Manu";
        float nota = 8.5f;

        System.out.println("A nota é: " + nota);
        System.out.printf("A nota de %s é: %.2f%n", nome, nota);
        System.out.format("A nota de %s é: %.2f%n", nome, nota);

//        ENTRADA DE DADOS
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o nome do aluno: ");
        String nome2 = teclado.nextLine();
        System.out.println("Digite a nota do aluno: ");
        float nota2 = teclado.nextFloat();

        System.out.printf("O aluno %s obteve a nota %.2f", nome2, nota2);
    }
}
