package Exercicio03;

import java.util.Scanner;

public class Idades {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome da primeira pessoa:");
        String nome1 = sc.nextLine();

        System.out.println("Digite a idade da primeira pessoa:");
        int idade1 = sc.nextInt();
        sc.nextLine(); // Consome a quebra de linha pendente

        System.out.println("Digite o nome da segunda pessoa:");
        String nome2 = sc.nextLine();

        System.out.println("Digite a idade da segunda pessoa:");
        int idade2 = sc.nextInt();

        double media = (idade1 + idade2) / 2.0;

        System.out.printf("A idade média de %s e %s é = %.1f%n", nome1, nome2, media);

        sc.close();
    }
}
