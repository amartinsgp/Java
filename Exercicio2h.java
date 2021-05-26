import java.util.Scanner;

public class Exercicio2h{
    public static void main (String args[]){
        Scanner teclado = new Scanner(System.in);

        double raio, altura, area, pi, diametro;

        //entrada de dados
        System.out.println ("Digite o valor da altura ");
        altura = teclado.nextDouble();

        System.out.println ("Digite o valor do diametro");
        diametro = teclado.nextDouble();

        //processamento
        pi = 3.14;
        raio = diametro/2;

        area = pi * raio * raio * altura;

        System.out.println ("A area do cilindro é de  " + area);

    }
}