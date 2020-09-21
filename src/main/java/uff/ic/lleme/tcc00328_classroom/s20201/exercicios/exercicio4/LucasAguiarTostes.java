package uff.ic.lleme.tcc00328_classroom.s20201.exercicios.exercicio4;

import java.util.Scanner;

public class LucasAguiarTostes {
	public static void primo(int num) {
		int count=0;
		int val=1;
		while (val <= num){
			if ((num % val) == 0){
				count++;
			}
			val++;
		}	
		if (count==2) {
			System.out.println("o numero eh primo");
			
		}else {
			System.out.println("o numero nao eh primo");
		}
		
	}

}
