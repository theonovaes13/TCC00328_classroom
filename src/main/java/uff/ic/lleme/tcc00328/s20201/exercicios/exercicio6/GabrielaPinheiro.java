package uff.ic.lleme.tcc00328.s20201.exercicios.exercicio6;
import java.util.Scanner;

public class GabrielaPinheiro {
    public static double serie(int n){
        double soma = 0;
        int i = 0;
        do{
            soma += (Math.pow(-1,i))/(2*i+1);
            i ++;
        }while(i < n);

        
        return 4*soma;
    }

    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o númerode termos da série:");
        n = in.nextInt();
        System.out.println("O somatório resulta em: ");
        System.out.println(serie(n));
    }
    
}
