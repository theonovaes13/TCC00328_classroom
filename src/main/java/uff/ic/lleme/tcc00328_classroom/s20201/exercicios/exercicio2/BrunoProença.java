package uff.ic.lleme.tcc00328_classroom.s20201.exercicios.exercicio2;

import java.util.Scanner;

public class BrunoProença {

	public static void main(String[] args) {
		int fat = 1, n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre com o número que deseja fatorar: ");
		n = sc.nextInt();
		do{
			fat *= n;
			n--;
		}while(n>=1);
		if(n <= 0) {
			fat = 1;
		}
		System.out.println("O resultado do fatorial é: " + fat);
	}

}
