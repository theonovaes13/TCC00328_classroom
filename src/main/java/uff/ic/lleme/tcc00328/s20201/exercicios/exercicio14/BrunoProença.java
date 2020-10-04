package uff.ic.lleme.tcc00328.s20201.exercicios.exercicio14;

import java.util.Random;

public class BrunoProença {

	public static void main(String[] args) {
		int x=2, y=2;
		float[][] matriz = new float[x][y];
		Random gerador = new Random();
		for(int i = 0; i<x; i++) {
			for(int j=0; j<y; j++) {
				matriz[i][j] = (float)(gerador.nextFloat()+gerador.nextInt(20));
			}
		}
		for(int i = 0; i<x; i++) {
			System.out.print("|");
			for(int j = 0; j<y; j++) {
				System.out.print(" " + matriz[i][j]);
			}
			System.out.print("|\n");
		}
		System.out.print("\n");
		System.out.println(determinante(matriz));
	}
	
	public static float determinante(float[][] A) {
		float det=0;
		float[][] sub;
		if(A.length > 2) {
			for(int j = 0; j<A[0].length;j++) {
				for(int i = 0; i<A.length;i++) {
					sub = submatriz(A,i,j);
					det = (float) (A[i][j]*Math.pow((-1),(i+j))*determinante(sub));
				}
			}
		}else {
			det = A[0][0]*A[1][1] - A[0][1]*A[1][0];
			return det;
		}
		return 0;
	}
	
	public static float[][] submatriz(float[][] A, int i, int j){
		float[][] sub = new float[A.length-1][A[0].length-1];
		int x = 0, y = 0;
		for(int a = 0; a < A.length; a++) {
			if(a != i) {
				for(int b =0; b < A.length;b++) {
					if(b!=j) {
						sub[y][x] = A[a][b];
						x++;
					}else {
						continue;
					}
				}
				x = 0;
				y++;
			}else {
				continue;
			}
		}
		return sub;
	}

}
