package Exercicio08;

import java.util.Scanner;

public class Consumo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a distancia percorrida:");
        int distancia = sc.nextInt();
        sc.nextLine();

        System.out.println("Digite o total de combustivel gasto:");
        double combustivel = sc.nextDouble();

        double media = distancia / combustivel;

        System.out.printf("O consumo médio é de %.3f%n", media);

        sc.close();
    }

}
