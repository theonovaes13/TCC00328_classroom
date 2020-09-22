package uff.ic.lleme.tcc00328_classroom.s20201.exercicios.exercicio7;

public class BrunoProença {

	public static void main(String[] args) {
		mdc(42,24);
		System.out.println("\n");
		mdc(42,23);
		System.out.println("\n");
		mdc(15,5);
	}
	
	public static void mdc(int a, int b) {
		int mdc = 1, limit = b;
		
		if(a<b) {
			int temp;
			temp = a;
			a = b;
			b = temp;
		}
		for(int i = 1; i < limit; i++) {
			mdc = a%b;
			System.out.println("Saída " + i + ": x = " + a + " / y = " + b + " / r = " + mdc);
			a = b;
			b = mdc;
			if(mdc == 0) {
				mdc = a;
				break;
			}
		}
		System.out.println("O MDC é: " + mdc);
	}

}
