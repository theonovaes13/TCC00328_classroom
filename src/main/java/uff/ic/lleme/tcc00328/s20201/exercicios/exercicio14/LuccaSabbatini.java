/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uff.ic.lleme.tcc00328.s20201.exercicios.exercicio14;

/**
 *
 * @author lucca
 */
public class LuccaSabbatini {
    public static void main(String[] args) {
        float[][] A = {
            {3.0f, 1.0f, -2.0f, 1.0f}, 
            {5.0f, 2.0f, 2.0f, 3.0f}, 
            {7.0f, 4.0f, -5.0f, 0f}, 
            {1.0f, -1.0f, 11.0f, 2.0f}
        };
        
        System.out.println("Determinante: " + determinante(A));
    }
    
    public static float determinante(float[][] A) {
        int i = 0;
        float det = 0;
        
        if (A.length == 1) {
            det = A[0][0];
        } else {
            for (int j = 0; j < A.length; j++) {
                det += A[0][j] 
                        * Math.pow(-1.0, i + j + 2) 
                        * determinante(submatriz(A, i, j));
            }
        }
        
        return det;
    }
    
    public static float[][] submatriz(float[][] A, int i, int j) {
        int newLength = A.length - 1, count = 0;
        float[] elementosA = new float[newLength * newLength]; 
        float[][] subA = new float[newLength][newLength];
        
        for (int n = 0; n < A.length; n++) {
            for (int m = 0; m < A.length; m++) {
                if (n != i && m != j) {
                    elementosA[count] = A[n][m];
                    count++;
                }
            }
        }
        
        count = 0;
        
        for (int n = 0; n < newLength; n++) {
            for (int m = 0; m < newLength; m++) {
                subA[n][m] = elementosA[count];
                count++;
            }
        }
        
        return subA;
    }
}
