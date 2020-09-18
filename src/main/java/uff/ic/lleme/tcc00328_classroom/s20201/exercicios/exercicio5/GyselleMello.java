package uff.ic.lleme.tcc00328_classroom.s20201.exercicios.exercicio5;
import java.util.Scanner;

public class GyselleMello {
    public static int fibonacci(int n) {
        if (n < 2)
            return n;
        else
            return fibonacci(n - 1) + fibonacci(n - 2);
    }
    public static void main(String[] args) {
        int t, resp;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite o termo: ");
        t = entrada.nextInt();
        
        resp = fibonacci(t);
        System.out.println("O " + t + "-ésimo termo da sequência é: " + resp);
    }
}
