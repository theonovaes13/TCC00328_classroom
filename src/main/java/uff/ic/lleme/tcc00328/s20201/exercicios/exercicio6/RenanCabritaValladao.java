package uff.ic.lleme.tcc00328.s20201.exercicios.exercicio6;
import java.util.Scanner;

public class RenanCabritaValladao {
    public static int n;
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o número de termos desejado:");
        n = in.nextInt();
        System.out.println("Resultado: " + serie(n));
    }
    
    public static double serie(int n){
        double i = 0, soma = 0;
        while (i<n){
            soma += (Math.pow(-1, i))/((2*i)+1);
            i++;
        }
        return 4*soma;
    }
}
