/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uff.ic.lleme.tcc00328_classroom.s20201.exercicios.exercicio8;

import java.util.Scanner;

/**
 *
 * @author Bueno
 */
public class GabrielBueno {
    
    public static int number;
    
    
    public static void main(String[] args){
   
        number = 1;
        
        System.out.println(isPrime(number));
        
    }
    
    public static String isPrime(int num){
        int i;

        if(num > 1){
            
            for(i=2; i<=Math.sqrt(num); i++){
                if(num % i == 0){
                    return "Não é primo.";
                }
            }
            
            return "É primo";
            
        }else if(num == 1){
            return "Não é primo.";
        }
        
        return "Informe um valor válido";
    }
}
