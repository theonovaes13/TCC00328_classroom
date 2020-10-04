package uff.ic.lleme.tcc00328.s20201.exercicios.exercicio4;

import java.util.Scanner;

public class BrunoProença {

	public static void main(String[] args) {
		int num, test=1, quant = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o número que deseja verificar se é primo: ");
		num = sc.nextInt();
		do {
			if(num%test == 0) {
				quant++;
				System.out.println(quant);
			}
			test++;
		}while(test<=num);
		if(quant == 2) {
			System.out.println("É primo");
		}else {
			System.out.println("Não é primo");
		}
	}

}
