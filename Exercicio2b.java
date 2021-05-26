import java.util.Scanner;

public class Exercicio2b{
    public static void main (String args[]){
        Scanner teclado = new Scanner(System.in);

        double base, altura, area;

        //entrada de dados
        System.out.println ("Digite o valor da base do retangulo");
        base = teclado.nextDouble();

        System.out.println ("Digite o valor da altura do retangulo");
        altura = teclado.nextDouble();

        //processamento
        area = base * altura;

        System.out.println ("A area do retangulo é de  " + area);

    }
}