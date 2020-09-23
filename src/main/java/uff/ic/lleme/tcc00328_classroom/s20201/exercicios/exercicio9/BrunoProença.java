package uff.ic.lleme.tcc00328_classroom.s20201.exercicios.exercicio9;

public class BrunoProença {

	public static void main(String[] args) {
		fibonacci(1);
		System.out.println("\n");
		fibonacci(4);
		System.out.println("\n");
		fibonacci(10);
	}
	
	public static void fibonacci(int termo) {
		int termo0 = 0, termo1 = 1, soma = 0;
		if(termo == 0) {
			soma = 0;
		}else if(termo ==1) {
			soma = 1;
		}else {
			for(int i = 2; i <= termo; i++) {
				soma = termo0 + termo1;
				termo0 = termo1;
				termo1 = soma;
			}
		}
		System.out.println(soma);
	}
}
