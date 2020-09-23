package uff.ic.lleme.tcc00328_classroom.s20201.exercicios.exercicio5;

public class LucasAguiarTostes {
	
	public static void main(String[] args) {
		int num = 5;
		System.out.println("o número é:"+fibonacci(num));
		
		num = 7;
		System.out.println("o número é:"+fibonacci(num));
		
		num = 12;
		System.out.println("o número é:"+fibonacci(num));
	}
	
	
	
	
	public static int fibonacci(int num) {
		int val1=0, val2=1,val3=0, count=2;
		if (num==0) {
			return 0;
		}
		if (num==1) {
			return 1;
		}
		while(count<num) {
			val3 = val1 + val2;
			val1=val2;
			val2=val3;
			count++;
		}
		
		
		
		return val3;
	}

}
