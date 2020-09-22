package uff.ic.lleme.tcc00328_classroom.s20201.exercicios.exercicio13;

import java.util.Scanner;

public class BrunoProença {

	public static void main(String[] args) {
		System.out.println("O valor da media é: " + media());
	}
	
	public static double media() {
		double a, media, soma = 0, n = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre com o primeiro valor da média: ");
		a = sc.nextDouble();
		while(a > 0) {
			soma += a;
			n++;
			System.out.println("Caso não queira inserir mais nenhum valor digite um valor negativo. \nEntre com o proximo valor da média: ");
			a = sc.nextDouble();
		}
		sc.close();
		media = soma/n;
		return media;
	}

}
