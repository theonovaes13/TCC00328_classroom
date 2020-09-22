package uff.ic.lleme.tcc00328_classroom.s20201.exercicios.exercicio3;

import java.util.Scanner;

public class LucasAguiarTostes {
	
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
