package Exercicio10;

import java.util.Scanner;

public class Duracao {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a duração em segundos:");
        int duracao = sc.nextInt();
        sc.nextLine();

        int horas = duracao / 3600;
        int minutos = (duracao % 3600) / 60;
        int segundos = duracao % 60;

        System.out.printf("Tempo convertido: %02d:%02d:%02d\n", horas, minutos, segundos);

        sc.close();
    }

}
