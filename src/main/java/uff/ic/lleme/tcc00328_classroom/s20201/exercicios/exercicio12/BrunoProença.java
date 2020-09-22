package uff.ic.lleme.tcc00328_classroom.s20201.exercicios.exercicio12;

import java.util.ArrayList;

public class BrunoProença {

	public static void main(String[] args) {
		divisores(1);
		System.out.println("\n");
		divisores(10);
		System.out.println("\n");
		divisores(5);
		System.out.println("\n");
		divisores(50);
		System.out.println("\n");
	}
	
	public static void divisores(int n) {
		ArrayList<Integer> divisores = new ArrayList<>(10);
		int a = 0;
		for(int i = 1; i <= n; i++) {
			if(n%i == 0) {
				divisores.add(i);
				a++;
			}
		}
		System.out.println("Divisores de " + n + ": ");
		for(int i = 0; i < divisores.size();i++) {
			System.out.println(divisores.get(i));
		}
	}

}
