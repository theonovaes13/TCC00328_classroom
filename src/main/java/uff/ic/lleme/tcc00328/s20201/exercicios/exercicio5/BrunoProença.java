package uff.ic.lleme.tcc00328.s20201.exercicios.exercicio5;

import java.util.Scanner;

public class BrunoProença {

	public static void main(String[] args) {
		int a = 0,b = 1, soma, n, cont = 3;
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre com o termo da sequência que deseja obter: ");		
		n = sc.nextInt();
		if(n == 1) {
			a = 0;
		}else if(n == 2){
			a = 1;
		}else {
			while(cont <= n){
				soma = a + b;
				a = b;
				b = soma;
				cont ++;
			};
			a = b;
		}
		System.out.println("O termo " + n + " é: " + a);
	}

}
