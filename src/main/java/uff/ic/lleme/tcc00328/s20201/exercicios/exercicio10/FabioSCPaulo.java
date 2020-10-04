/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uff.ic.lleme.tcc00328.s20201.exercicios.exercicio10;

import java.util.*;

/**
 *
 * @author fabio
 */
public class FabioSCPaulo {
    
    public static void main(String[] args) { 
       
        Scanner in = new Scanner(System.in);
        System.out.println("Informe um numero n: ");
        int n = in.nextInt();
        double soma = 0;
        for(int i=0;i<=n;i++){
            soma += (double) Math.pow(-1,i)/(2*i+1) * 4;
        }
        System.out.printf("%f", soma);

    }
}