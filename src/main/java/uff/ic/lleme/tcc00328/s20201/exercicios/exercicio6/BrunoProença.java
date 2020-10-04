package uff.ic.lleme.tcc00328.s20201.exercicios.exercicio6;

import java.text.DecimalFormat;
import java.util.Scanner;

public class BrunoProença {

	public static void main(String[] args) {
		double soma = 0, resultado;
		int i = 0, n;
		DecimalFormat df = new DecimalFormat("0.00");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre com a quantidade de termos do somatório: ");
		n = sc.nextInt();
		
		do {
			soma += (Math.pow(-1,i))/(2*i+1);
			i++;
		}while(i <= (n-1));
		resultado = 4*soma;
		System.out.println("O resultado do somatório no termo " + n + " é: " + df.format(resultado));
	}

}
