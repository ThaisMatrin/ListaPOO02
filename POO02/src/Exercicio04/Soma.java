package Exercicio04;

import java.util.Scanner;


public class Soma {

     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

         double x, y;


        System.out.println("Digite o valor de x");
        x = sc.nextDouble();


        System.out.println("Digite o valor de y");
        y = sc.nextDouble();
   
        System.out.printf("SOMA = %.2f%n", (x + y));

         sc.close();
     }

}
