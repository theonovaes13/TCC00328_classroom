package uff.ic.lleme.tcc00328.s20201.exercicios.exercicio15;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Random;

public class BrunoProença {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("0.00");
		Random gerador = new Random();
		
		float[] numeros = new float[10];
		System.out.print("| ");
		for(int i =0; i<numeros.length;i++) {
			numeros[i] = gerador.nextFloat() + gerador.nextInt(5);
			System.out.print(numeros[i] + " | ");
		}
		System.out.println();
		
		float[] categorias = new float[4];
		System.out.print("| ");
		for(int i =0; i<categorias.length;i++) {
			categorias[i] = gerador.nextFloat() + gerador.nextInt(5);
			System.out.print(categorias[i] + " | ");
		}
		System.out.println();
		
		Arrays.sort(categorias);
		
		for(int i =0; i<categorias.length;i++) {
			System.out.print(categorias[i] + " | ");
		}
		System.out.println();
		
		float[] histograma;
		histograma = histograma(numeros, categorias);
		for(int i = 0; i < histograma.length; i++) {
			System.out.println("Categoria " + (i+1) + ": " + df.format(histograma[i]) + "%");
		}
	}
	
	public static float[] histograma(float[] numeros, float[] categorias) {
		float[] histograma = new float[categorias.length-1];
		int i;
		for(i = 0; i<histograma.length;i++) {
			histograma[i] = 0;
		}
		for(i = 0; i<numeros.length;i++) {
			int a = categoria(numeros[i], categorias);
			if(a != -1) {
				histograma[a]++;
			}else {
				continue;
			}
		}
		for(i = 0; i<histograma.length;i++) {
			histograma[i] /= numeros.length;
			histograma[i] *= 100;
		}
		return histograma;
	}
	
	public static int categoria(float numero, float[] categs) {
		int categoria=-1;
		for(int i = 0; i < (categs.length-1); i++) {
			if(numero >= categs[i] && numero <= categs[i+1]) {
				categoria = i;
				break;
			}
		}
		return categoria;
	}

}
