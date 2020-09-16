package uff.ic.lleme.tcc00328_classroom.s20201.exercicios.exercicio3;

import java.util.Scanner;

public class BrunoProença {

	public static void main(String[] args) {
		int x, y, r, cont = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Esse programa calcula o MDC entre dois valores inteiros, através do Algoritmo de Euclides. \nEntre com o primeiro valor: ");
		x = sc.nextInt();
		System.out.println("Entre com o segundo valor: ");
		y=sc.nextInt();
		if(x<y){//Garantia de que x sempre vai ser maior que y, para não dar erro no algoritmo
			int temp;
			temp = x;
			x = y;
			y = temp;
		}
		do{
			r=x%y;
			System.out.println("Saída " + cont + ": x = " + x + " / y = " + y + " / r = " + r);
			x = y;
			y = r;
		}while(r!=0);
		System.out.println("O valor do MDC é: " + x);
	}

}
