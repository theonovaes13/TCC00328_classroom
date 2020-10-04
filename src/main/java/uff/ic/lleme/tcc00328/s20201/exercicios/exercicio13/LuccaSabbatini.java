/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uff.ic.lleme.tcc00328.s20201.exercicios.exercicio13;
import java.util.Scanner;

/**
 *
 * @author lucca
 */
public class LuccaSabbatini {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Informe a quantidade de números para cálculo de média:");
        int n = in.nextInt();
        
        if (n > 0) {
            float[] valores = new float[n];
            preencheArray(valores, n, in);
            System.out.println("Média: " + calcMedia(valores, n));
        } else {
            System.out.println("ERRO: Digite um número positivo.");
            System.exit(0);
        }
    }
    
    public static void preencheArray(float[] valores, int n, Scanner in) {                
        for (int i = 0; i < n; i++) {
            System.out.println("Informe o termo " + (i + 1) + ": ");
            valores[i] = in.nextFloat();
        }
    }
    
    public static float calcMedia(float[] valores, int n) {
        float res = 0;
        
        for (int i = 0; i < n; i++) {
            res += valores[i];
        }
        
        return res /= n;
    }
}
