package uff.ic.lleme.tcc00328_classroom.s20201.exercicios.exercicio11;

public class BrunoProença {

	public static void main(String[] args) {
		System.out.println("A multiplicação dos 50 primeiros números primos é: " + resultado());

	}

	public static int primo(int i) {
		int test=1, quant = 0;
		do {
			if(i%test == 0) {
				quant++;
			}
			test++;
		}while(test<=i);
		if(quant == 2) {
			return i;
		}
		return 1;
	}
	
	public static long resultado() {
		long result = 1;
		for(int i = 1; i<=50; i++) {
			result *= primo(i);
		}
		return result;
	}
	
}
