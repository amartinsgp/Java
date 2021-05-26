import java.util.Scanner;

public class Exercicio2d{
    public static void main (String args[]){
        Scanner teclado = new Scanner(System.in);

        double d2, d1, area;

        //entrada de dados
        System.out.println ("Digite o valor da primeira Diagonal");
        d1 = teclado.nextDouble();

        System.out.println ("Digite o valor da segunda diagonal");
        d2 = teclado.nextDouble();

        //processamento
        area = d1 * d2;

        System.out.println ("A area do losango é de  " + area);

    }
}