package uff.ic.lleme.tcc00328_classroom.s20201.exercicios.exercicio8;

public class BrunoProença {

	public static void main(String[] args) {
		primo(1);
		System.out.println("\n");
		primo(2);
		System.out.println("\n");
		primo(23);
		System.out.println("\n");
		primo(86);
	}
	
	public static void primo(int a) {
		int quant = 0;
		for(int i = 1; i <= a; i++) {
			if(a%i == 0)
				quant++;
		}
		if(quant == 2) {
			System.out.println("É primo");
		}else {
			System.out.println("Não é primo");
		}
	}

}
