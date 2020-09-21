package uff.ic.lleme.tcc00328_classroom.s20201.exercicios.exercicio6;

public class LucasAguiarTostes {
	public static int formula(int n) {
		int i=0, soma=0;
	
		while (i < n){
			soma+=4*(Math.pow(-1,i)/(2*i+1));
			i++;
			
		}
		return soma;
	}

}
