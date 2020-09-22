package uff.ic.lleme.tcc00328_classroom.s20201.exercicios.exercicio6;
import java.util.Scanner;

public class GyselleMello {
    public static void main(String[] args) {
        double n, i = 0, j = 0, calc = 0;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Insira o valor de n:");
        n = entrada.nextInt();
        
        while(j<n) {
           calc += ((Math.pow(-1, i))/((2*i)+1));
           i++;
           j++;
        }
        
        calc *= 4;
        System.out.println("Resultado da série: " + calc);
    }
}
