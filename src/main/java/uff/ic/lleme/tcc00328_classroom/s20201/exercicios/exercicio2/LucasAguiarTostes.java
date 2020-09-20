package uff.ic.lleme.tcc00328_classroom.s20201.exercicios.exercicio2;
import java.util.Scanner;


public class LucasAguiarTostes {
	
	public static int fatorial(int num){
		int resultado = 1;	
		while(num>0) {
			resultado *= num;
			num--;
		}
		return resultado;
	}
}


