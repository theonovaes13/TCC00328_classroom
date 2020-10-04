package uff.ic.lleme.tcc00328.s20201.exercicios.exercicio7;
import java.util.Scanner;

public class GyselleMello {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int x, y, r, i;
        
        System.out.println("Digite o primeiro valor:");
        x = entrada.nextInt();
        System.out.println("Digite o segundo valor:");
        y = entrada.nextInt();
        
        for(i=y;i!=0;i=y) {
            r = x % y;
            x = y;
            y = r;
        }
        System.out.println("MDC = " + x);
    }
}
