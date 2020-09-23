package uff.ic.lleme.tcc00328_classroom.s20201.exercicios.exercicio3;

import java.util.Scanner;

public class LucasAguiarTostes {
	public static void main(String[] args) { 
		int num1 = 32;
		int num2 = 24;
		System.out.println("o mdc é:"+ MDC(num1,num2));
		
		num1=100;
		num2=50;
		System.out.println("o mdc é:"+ MDC(num1,num2));
		
		num1=64;
		num2=20;
		System.out.println("o mdc é:"+ MDC(num1,num2));
	}		
	
	public static int MDC(int num1, int num2) {
		int resto=1;
		while (resto !=0){
		resto = num1 % num2;
		num1 = num2;
		num2 = resto;
		}
		return num1;
	}

	    
}
