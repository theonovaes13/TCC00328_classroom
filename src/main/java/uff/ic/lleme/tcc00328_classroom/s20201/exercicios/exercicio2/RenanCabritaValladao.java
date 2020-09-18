package uff.ic.lleme.tcc00328_classroom.s20201.exercicios.exercicio2;
import java.util.Scanner;


public class RenanCabritaValladao {
    public static int x;
    
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Digite um valor:");
        x = in.nextInt();
        System.out.println("Fatorial de " + x + ": " + fatorial(x));
    }
    
    public static int fatorial(int y){
        int n = 1, result = 1;
        while(n<=y)
            result = result * n++;
        return result;
    }
}
