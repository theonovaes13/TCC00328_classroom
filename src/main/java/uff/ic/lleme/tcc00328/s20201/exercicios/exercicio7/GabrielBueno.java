/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uff.ic.lleme.tcc00328.s20201.exercicios.exercicio7;

import java.util.Scanner;

/**
 *
 * @author Bueno
 */
public class GabrielBueno {
    
    public static int number1, number2;
    
    public static void main(String[] args){
        
        number1 = 111;
        number2 = 18;
        
        if(number1 > 0 && number2 > 0){
            
            System.out.println("O MDC é:");
            
            System.out.println(mcd(number1, number2));
            
        }else{
            
            System.out.println("Informe valores válidos.");
            
        }
    }
    
    public static int mcd(int num1, int num2){
        
        int index = 0, i ;
        
        for(i = 0; i <=index; i++){
            if(num1 == num2){
                return num1;
            }else if(num1 > num2){
                num1 -= num2;
            }else{
                num2 -= num1;
            }
            
            index ++;
        }
        
      
        
        return num1;
    }
    
}
