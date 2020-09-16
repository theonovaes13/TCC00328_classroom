package uff.ic.lleme.tcc00328_classroom.s20201.exercicios.exercicio2;

import java.util.Scanner;

public class BrunoProença {

	public static void main(String[] args) {
		int fat = 1, n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre com o número que deseja fatorar: ");
		n = sc.nextInt();
		while(n>=1) {
			fat *= n;
			n--;
		}
		System.out.println("O resultado do fatorial é: " + fat);
	}

}
