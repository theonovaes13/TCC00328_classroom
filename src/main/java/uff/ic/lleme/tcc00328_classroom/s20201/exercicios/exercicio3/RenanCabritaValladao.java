package uff.ic.lleme.tcc00328_classroom.s20201.exercicios.exercicio3;
import java.util.Scanner;

public class RenanCabritaValladao {
    public static int x, y;
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Digite um valor para x:");
        x = in.nextInt();
        System.out.println("Digite um valor para y:");
        y = in.nextInt();
        System.out.println("MDC de " + x + " e " + y + ": " + mdc(x, y));
    }
    
    public static int mdc(int x, int y){
        int r = x%y;
        while(r!=0){
            x = y;
            y = r;
            r = x%y;
        }
        return y;
    }
}
