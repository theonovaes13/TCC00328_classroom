package uff.ic.lleme.tcc00328_classroom.s20201.exercicios.exercicio10;

import java.text.DecimalFormat;

public class BrunoProença {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("0.00");
				
		System.out.println("O termo 1 do somatório é: " + df.format(fat(1)));
		
		System.out.println("O termo 2 do somatório é: " + df.format(fat(2)));
		
		System.out.println("O termo 5 do somatório é: " + df.format(fat(5)));
		
		System.out.println("O termo 10 do somatório é: " + df.format(fat(10)));
	}
	
	public static double fat(int n) {
		double result = 0;
		
		for(int i = 0; i<=(n-1); i++) {
			result += (Math.pow((-1), i))/(2*i + 1);
		}
		result *= 4;
		
		return result;
	}

}
