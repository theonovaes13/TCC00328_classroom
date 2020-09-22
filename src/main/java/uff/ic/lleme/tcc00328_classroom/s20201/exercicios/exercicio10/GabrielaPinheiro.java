package uff.ic.lleme.tcc00328_classroom.s20201.exercicios.exercicio10;
import java.util.Scanner;

public class GabrielaPinheiro {
    public static double serie(int n){
        double soma = 0;
        for(int i = 0; i < n; i++){
            soma += (Math.pow(-1,i))/(2*i+1);
        }
        return 4*soma;
    }

    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        n = 1;
        System.out.println("O somatório com "+ n +" valores resulta em: ");
        System.out.println(serie(n));
        
        n = 2;
        System.out.println("O somatório com "+ n +" valores resulta em: ");
        System.out.println(serie(n));
        
        n = 5;
        System.out.println("O somatório com "+ n +" valores resulta em: ");
        System.out.println(serie(n));
        
    }
    
}
