import java.util.Scanner;

public class Uri1060{
    public static void main (String args []){
        Scanner teclado  = new Scanner (System.in);

        float valor;

        int qtde = 0;

        for ( int contador=1; contador<=6; contador = contador+1){
            valor = teclado.nextInt();

            if (valor > 0){
                qtde = qtde +1;
            }
        }
        System.out.println(qtde + "Valores positvos");
    }
}