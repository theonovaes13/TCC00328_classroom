package uff.ic.lleme.tcc00328.s20201.exercicios.exercicio4;

import java.util.Scanner;

public class LucasAguiarTostes {
	
	public static void main(String[] args) {
		int num=7;
		primo(7);
		
		num=17;
		primo(num);
		
		num = 20;
		primo(num);
		
	}
	
	
	
	
	
	
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
			System.out.println("o numero eh primo.");
			
		}else {
			System.out.println("o numero nao eh primo.");
		}
		
	}

}
