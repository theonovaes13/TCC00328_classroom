package uff.ic.lleme.tcc00328.s20201.exercicios.exercicio9;
import java.util.Scanner;

public class GyselleMello {
    public static int fibonacci(int n){
        int t1 = 1,  t2 = 0, aux;
        for (int i = 1; i <= n; i++){
                aux = t1;
                t1 += t2;
                t2 = aux;
            }
            return t2;
        } 
    public static void main(String[] args) {
        int t, resp;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite o termo:");
        t = entrada.nextInt();
        
        resp = fibonacci(t);
        System.out.println("O " + t + "-ésimo termo da sequência é: " + resp);
    }
}
