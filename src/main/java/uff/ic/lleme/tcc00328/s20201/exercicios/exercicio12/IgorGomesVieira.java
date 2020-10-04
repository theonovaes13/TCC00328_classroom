
package uff.ic.lleme.tcc00328.s20201.exercicios.exercicio12;

import java.util.Scanner;

public class IgorGomesVieira {
    public static int numero;

    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite um numero inteiro: ");
        numero = in.nextInt();
        divisoresDe(numero);
    }
    public static void divisoresDe (int numero){
	int i=1;
        for(i=1;i<=numero;i++){
            if( numero % i == 0){
                System.out.println(i+" é um divisor de " + numero);
            }
        }
    }
}
