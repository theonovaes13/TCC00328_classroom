package uff.ic.lleme.tcc00328_classroom.s20201.exercicios.exercicio8;

public class LucasAguiarTostes {
	public static void main(String[] args) {
		
		int num = 7;
		System.out.println("primo teste 1: ");
		primo(num);
		
		num = 44;
		System.out.println("primo teste 2: ");
		primo(num);
		
				
		
		
		
	}
	
	
	
	
	
	public static void primo(int num) {
		int count=0;
		
		for (int val=1;val <= num;val++){
			if ((num % val) == 0){
				count++;
			}
			
		}	
		if (count==2) {
			System.out.println("o numero eh primo");
			
		}else {
			System.out.println("o numero nao eh primo");
		}
		
	}
	

}
