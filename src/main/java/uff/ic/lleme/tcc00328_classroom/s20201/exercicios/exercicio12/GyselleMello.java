package uff.ic.lleme.tcc00328_classroom.s20201.exercicios.exercicio12;
import java.util.Scanner;

public class GyselleMello {
    public static void main(String[] args) {
        int n, i;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Informe um número:");
        n = entrada.nextInt();
        
        if(n <= 0){
            System.out.println("O número precisa ser maior ou diferente de zero!");
        } else {
            for(i=n;i>0;i--){
                if(n%i==0){
                    System.out.println(i + " é divisor de " + n);
                }
            }
        }
    }
}
