package uff.ic.lleme.tcc00328_classroom.s20201.exercicios.exercicio10;

public class LucasAguiarTostes {
	
	public static void main(String[]args) {
		double n = 5;
		n = formula(n);
		System.out.println("teste 1: " + n);
		
		n = 8;
		n = formula(n);
		System.out.println("teste 2: "+ n);
		
	}
	
	
	
	public static double formula(double n) {
		double soma=0;
	
		for(int i=0;i < n;i++){
			soma+=(Math.pow(-1,i))/(2*i+1);
			
			
		}
		soma = soma*4;
		return soma;
	}
	

}
