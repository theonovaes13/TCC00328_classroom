package uff.ic.lleme.tcc00328.s20201.exercicios.exercicio9;

public class LucasAguiarTostes {
	
	public static void main(String[] args) {
		int num = 5;
		num = fibonacci(num);
		System.out.println("teste 1: "+ num);
		
		num = 12;
		num = fibonacci(num);
		System.out.println("teste 2: "+ num);			
	}
	
	public static int fibonacci(int num) {
		int val1=0, val2=1,val3=0;
		if (num==0) {
			return 0;
		}
		if (num==1) {
			return 1;
		}
		for(int count=0;count<=num;count++) {
			val3 = val1 + val2;
			val1=val2;
			val2=val3;
			
		}
		
		
		
		return val3;
	}
	

}
