import java.util.Scanner;

public class Exercicio2e{
    public static void main (String args[]){
        Scanner teclado = new Scanner(System.in);

        double basemaior, basemenor, altura, area;

        //entrada de dados
        System.out.println ("Digite o valor da base maior");
        basemaior = teclado.nextDouble();

        System.out.println ("Digite o valor da base menor");
        basemenor = teclado.nextDouble();

        System.out.println ("Digite o valor da altura");
        altura = teclado.nextDouble();

        //processamento
        area = (basemaior + basemenor) * (altura/2);

        System.out.println ("A area do trapezio é de  " + area);

    }
}