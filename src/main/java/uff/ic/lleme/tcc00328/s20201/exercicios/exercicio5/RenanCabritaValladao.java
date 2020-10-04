package uff.ic.lleme.tcc00328.s20201.exercicios.exercicio5;
import java.util.Scanner;

public class RenanCabritaValladao {
    public static int n;
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o índice do termo desejado:");
        n = in.nextInt();
        System.out.println("Resultado: " + nFibonacci(n));
    }
    
    public static int nFibonacci(int n){
        int i = 0, f0 = 0, f1 = 1, s;
        while (i<n){
            s = f1+f0;
            f0 = f1;
            f1 = s;
            i++;
        }
        return f0;
    }
}
