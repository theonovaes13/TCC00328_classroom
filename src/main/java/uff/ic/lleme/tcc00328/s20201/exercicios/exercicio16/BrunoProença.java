package uff.ic.lleme.tcc00328.s20201.exercicios.exercicio16;

import java.util.Random;

public class BrunoProença {
	
	public static int count;

	public static void main(String[] args) {
		int x=5, y=5, jogos = 8;
		int[][] tabela = new int[x][y];
		Random gerador = new Random();
		for(int j = 0; j<y; j++) {
			if(j!=1) {
				for(int i=0; i<x; i++) {
					tabela[i][j] = gerador.nextInt(20);
				}
			}else {
				for(int i=0; i<x; i++) {
					tabela[i][j] = jogos;
				}
			}
		}
		for(int i = 0; i < x; i++) {
			for(int j = 0 ;j < y; j++) {
				System.out.print("| " + tabela[i][j] + " | ");
			}
			System.out.println();
		}
		System.out.println("O time vencedor é: " + lider(x,tabela));
	}
	
	public static int lider(int times, int[][] tabela) {
		int lider=0, temp=0;
		int[] coluna = new int[times];
		for(int j = 0; j<5;j++) {
			if(j != 1) {
				for(int i = 0; i<times;i++) {
					coluna[i] = tabela[i][j];
				}
				lider = compara(0, times, coluna);
				if(count == 0) {
					break;
				}
			}else {
				continue;
			}
		}
		return lider;
	}
	
	public static int compara(int pos, int quant, int[] coluna) {
		int lider = 0, temp=0;
		count = 0;
			for(int i = pos; i<quant;i++) {
				if(coluna[i]>temp) {
					temp = coluna[i];
					lider = i;
				}else if(coluna[i] == temp) {
					count++;
				}
			}
		return lider;
	}
	
	
}
