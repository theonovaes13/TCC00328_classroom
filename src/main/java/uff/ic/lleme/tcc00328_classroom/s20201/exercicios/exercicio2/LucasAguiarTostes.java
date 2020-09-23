package uff.ic.lleme.tcc00328_classroom.s20201.exercicios.exercicio2;
import java.util.Scanner;


public class LucasAguiarTostes {
	public static void main(String[] args) {
		int num=4;
		System.out.println("o fatorial é: "+fatorial(num));
		num= 7;
		System.out.println("o fatorial é: "+fatorial(num));
		num=1;
		System.out.println("o fatorial é: "+fatorial(num));
	}
	
	public static int fatorial(int num){
		int resultado = 1;	
		while(num>0) {
			resultado *= num;
			num--;
		}
		return resultado;
	}
}


