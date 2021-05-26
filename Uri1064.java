import java.util.Scanner;

public class Uri1064 {
    public static void main (String args[]){    
    
    Scanner teclado = new Scanner (System.in);

    float valor;    
    float soma, media;
    int qtde = 0;

    soma = 0;

    for ( int cont=1; cont <=6; cont++ ){
        valor = teclado.nextFloat();

        if (valor > 0){
            soma = soma+valor;
            qtde++;
        }
    }
        System.out.println ("Quantidade de valores positivos = " + qtde);

        media = soma / qtde;

        System.out.printf ("%.1f", media);
        System.out.println (" eh a media entre os valores positivos");
     
    }
}