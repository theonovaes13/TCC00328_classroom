/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uff.ic.lleme.tcc00328_classroom.s20201.exercicios.exercicio10;

import java.util.Scanner;

/**
 *
 * @author Bueno
 */
public class GabrielBueno {
    
    public static void main(String[] args){
        int n ;
        
        n = 3;
        
        System.out.println(sum(n));
        
    }
    
    public static double sum(int value){
        double E = 0;
        int i;
        
        for(i = 0; i <= value-1; i++){
            E += Math.pow(-1, i)/(2*i + 1);

        }
        
        E *= 4;
        
        return E;
    }
}