/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uff.ic.lleme.tcc00328_classroom.s20201.exercicios.exercicio13;

import java.util.*;

/**
 *
 * @author fabio
 */
public class FabioSCPaulo {
    
    public static void main(String[] args) { 
       
	Scanner in = new Scanner(System.in);
        System.out.println("Digite a quantidade n de valores: ");
        int n = in.nextInt();
        int vetor[] = new int[n];
        double media=0;
        for(int i=0;i<n;i++){
            System.out.println("Digite um numero: ");
            vetor[i] = in.nextInt();
            media += (double)vetor[i];
        }
        media /= (double)n;
        System.out.printf("%s %f \n", "A media eh: ",media);

    }
}