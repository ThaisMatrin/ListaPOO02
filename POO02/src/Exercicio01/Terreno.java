package Exercicio01;
import java.util.Scanner;
public class Terreno {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double largura, comprimento, valormetro, area, preco;


        System.out.println("Digite a largura do terreno");
        largura = sc.nextInt();


        System.out.println("Digite o comprimento do terreno");
        comprimento = sc.nextDouble();


        System.out.println("Digite o valor do metro quadrado do terreno");
        valormetro = sc.nextDouble();


        area = (largura * comprimento);
        preco = (area * valormetro);


   
        System.out.printf("A area do terreno é = %.2f%n", area);
        System.out.printf("O preço do terremo é = %.2f%n", preco);

         sc.close();


    }
  

}
