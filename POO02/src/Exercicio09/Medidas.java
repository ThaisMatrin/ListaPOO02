package Exercicio09;

import java.util.Scanner;

public class Medidas {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a medidade de A:");
        double medidaA = sc.nextDouble();
        sc.nextLine(); 

         System.out.println("Digite a medidade de B:");
        double medidaB = sc.nextDouble();
        sc.nextLine(); 

         System.out.println("Digite a medidade de C:");
        double medidaC = sc.nextDouble();
        sc.nextLine(); 

        double quadrado = medidaA * medidaA;
        double triangulo = (medidaA * medidaB)/2;
        double trapezio = (((medidaA + medidaB) * medidaC) /2);

        System.out.printf("ARE DO QUADRADO %.4f%n", quadrado);
        System.out.printf("ARE DO TRIANGULO %.4f%n", triangulo);
        System.out.printf("ARE DO TRAPEZIO %.4f%n", trapezio);

        sc.close();
     }

}
