package Exercicio07;

import java.util.Scanner;

public class Pagamento {

     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do funcionario:");
        String nome = sc.nextLine();

        System.out.println("Digite o valor por hora:");
        double valor = sc.nextDouble();
        sc.nextLine(); // Consome a quebra de linha pendente

        System.out.println("Digite a quantidade de horas trabalhadas:");
        int horas = sc.nextInt();

        double total = valor * horas;

        System.out.printf("O pagamento de %s é de %.1f%n", nome, total);

        sc.close();
     }

}
