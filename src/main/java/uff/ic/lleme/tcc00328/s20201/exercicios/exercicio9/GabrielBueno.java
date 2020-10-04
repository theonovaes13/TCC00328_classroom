/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uff.ic.lleme.tcc00328.s20201.exercicios.exercicio9;

import java.util.Scanner;

/**
 *
 * @author Bueno
 */
public class GabrielBueno {
       
    public static void main(String[] args){
        int value = 6;
        
        System.out.println(fibo(value));
        
    }
    
    public static int fibo(int value){
        int mid, prev2 = 1, prev1 = 0, num = 0, i;
        
        if(value == 2){
            return 1;
        }
        
        for(i = 2; i<=value; i++){
            num = prev1 + prev2;
            
            mid = prev2;
            
            prev2 = num;
            
            prev1 = mid;
        }
        
        return num;
    }
}
