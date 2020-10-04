package uff.ic.lleme.tcc00328.s20201.exercicios.exercicio11;

import java.util.ArrayList;

public class LucasAguiarTostes {
	
	public static void main(String[] args) {
		ArrayList<Integer> lista = new ArrayList();
		int count=0;
		int val=1;
		int num=2;
		long result=1;
		
		while (num <50) {
			while (val <= num){
				if ((num % val) == 0){
					count++;
				}
				val++;
			}	
			if (count==2) {
				lista.add(num);
			}
			num++;
			val=1;
			count=0;
			
		}		
		val=0;
		while(val<lista.size()) {
			result *= lista.get(val);
			System.out.println("posição: "+lista.get(val));
			System.out.println("resultado: "+result);
			val++;
		}
		System.out.println(result);
	}
	
	
	
	
	
	


}
