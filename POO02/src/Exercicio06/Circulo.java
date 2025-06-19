package Exercicio06;

import java.util.Scanner;

public class Circulo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor do raio do circulo: ");
        double r = sc.nextDouble();

        double area = Math.PI * r * r;

        System.out.printf("AREA %.2f%n", area);

        sc.close();

    }

}
