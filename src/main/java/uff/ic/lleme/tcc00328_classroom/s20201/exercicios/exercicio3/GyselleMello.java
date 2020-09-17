package uff.ic.lleme.tcc00328_classroom.s20201.exercicios.exercicio3;
import java.util.Scanner;

public class GyselleMello {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int x, y, r;
        
        System.out.println("Digite o primeiro valor:");
        x = entrada.nextInt();
        System.out.println("Digite o segundo valor:");
        y = entrada.nextInt();
        
        do {
            r = x % y;
            x = y;
            y = r; 
        }while(r != 0);
        System.out.println("MDC = " + x);
    }
}
