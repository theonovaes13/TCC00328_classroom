package uff.ic.lleme.tcc00328.s20201.exercicios.exercicio13;
import java.util.Scanner;


public class LucasAguiarTostes {
	
	public static void main(String[] args) {
		
		//quantidade dos n valores que serão calculados
		int n = 5;
		media(n);
		
		
	}
	
	
	
	
	
	
	
	
	public static void media(int num) {
		int count = 0;
		int media=0;
		int val;
		Scanner valor = new Scanner(System.in);
		while (count < num){
			System.out.println("digite um valor por vez: ");
			media += valor.nextInt();			
			count++;
			
		}
		System.out.println( media/num);
	}

}
