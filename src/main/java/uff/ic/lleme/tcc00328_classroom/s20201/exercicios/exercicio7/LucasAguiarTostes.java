package uff.ic.lleme.tcc00328_classroom.s20201.exercicios.exercicio7;

public class LucasAguiarTostes {
	public static void main(String[] args) {
		int num1 = 42;
		int num2 = 24;
		int resposta;
		resposta= MDC(num1,num2);
		System.out.println("MDC teste 1: "+ resposta);
		
		num1 = 42;
		num2 = 23;
		resposta = MDC(num1, num2);
		System.out.println("MDC teste 2: " + resposta);		
	}	
	
	
	
	
	public static int MDC(int num1, int num2) {
			
			for (int resto=1; resto!=0;){
				resto = num1 % num2;
				num1 = num2;
				num2 = resto;
			}
			return num1;
	}
	

}
