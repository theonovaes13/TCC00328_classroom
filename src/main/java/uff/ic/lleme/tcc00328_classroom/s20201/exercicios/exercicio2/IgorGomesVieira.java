
package uff.ic.lleme.tcc00328_classroom.s20201.exercicios.exercicio2;

import java.util.Scanner;

public class IgorGomesVieira {
    public static int numero;
    public static int resultadoFatorial;
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite um numero inteiro: ");
        numero = in.nextInt();
        resultadoFatorial = calculaFatorial(numero);
        System.out.println(resultadoFatorial);
        
    }
    public static int calculaFatorial (int numero){
	int i = numero -1;
	while (i>0){
		numero =numero * i;
		i--;
	}
        return numero;
}
}
