
package uff.ic.lleme.tcc00328.s20201.exercicios.exercicio10;
import java.util.Scanner;
public class IgorGomesVieira {
    public static int numero;
    public static double resposta;
    
    public static void main(String[] args) { 
        Scanner in = new Scanner(System.in);
        System.out.println("Digite um  numero: ");
        numero = in.nextInt();
        
        resposta = soma(numero);
       
        System.out.println("Soma: "+resposta);

    }

    public static double soma(int numero) {
         double soma =0;
         int i =0;
         for(i=0;i<numero;i++)
         {
             soma += (Math.pow(-1,i) / (2 * i + 1));
     
         }
         
         return 4*soma;
    }
}
