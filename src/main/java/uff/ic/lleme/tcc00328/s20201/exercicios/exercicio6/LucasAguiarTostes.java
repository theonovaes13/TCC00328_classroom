package uff.ic.lleme.tcc00328.s20201.exercicios.exercicio6;

public class LucasAguiarTostes {
	public static void main(String[] args) {
		int n = 3;
		System.out.println(formula(n));
		
		n=7;
		System.out.println(formula(n));
		
		n = 10;
		System.out.println(formula(n));
		
	}
	public static double formula(int n) {
		int i=0;
		double soma=0;
	
		while (i < n){
			soma+=  (Math.pow(-1,i))/(2*i+1);
			i++;
			
		}
		return 4*soma;
	}

}
