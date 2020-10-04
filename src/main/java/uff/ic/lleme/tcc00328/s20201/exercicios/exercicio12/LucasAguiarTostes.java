package uff.ic.lleme.tcc00328.s20201.exercicios.exercicio12;
import java.util.ArrayList;


public class LucasAguiarTostes {
	public static void main(String[] args) {
		
		int num = 10;
		System.out.println("os divisoresde 10 são:");
		divisores(num);
		
		num=27;
		System.out.println("os divisores de 27 são:");
		divisores(num);
				
	}
	
	
	
	
	public static void divisores(int num) {
		ArrayList<Integer> lista = new ArrayList();
		int count=0;
		int val=1;
		while (val <= num){
			if ((num % val) == 0){
				lista.add(val);
			}
			val++;
		}	
		System.out.println(lista);
		
	}

}
