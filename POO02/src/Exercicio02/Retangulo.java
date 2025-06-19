package Exercicio02;

import java.util.Scanner;

import Geometria.Diagonal;

public class Retangulo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

         double altura, base, perimetro, area, diagonal;


        System.out.println("Digite a altura do retangulo");
        altura = sc.nextDouble();


        System.out.println("Digite a base do retangulo");
        base = sc.nextDouble();

        area = (base * altura);
        perimetro = ((base + altura)*2);

        diagonal = Diagonal.calcularDiagonal(base, altura);
   
        System.out.printf("A area do retangulo é = %.4f%n", area);
        System.out.printf("O perimetro do retangulo é = %.4f%n", perimetro);
        System.out.printf("A diagonal do retangulo é = %.4f%n", diagonal);

         sc.close();

    }

}
