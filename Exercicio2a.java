import java.util.Scanner;

public class Exercicio2a{
    public static void main (String args[]){
        Scanner teclado = new Scanner(System.in);

        double lado, area;

        //entrada de dados
        System.out.println ("Digite o valor do lado");
        lado = teclado.nextDouble();

        //processamento
        area = lado * lado;

        System.out.println ("A area do quadrado de lado " + lado + " equivale a " + area);

    }
}