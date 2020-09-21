/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uff.ic.lleme.tcc00328_classroom.s20201.exercicios.exercicio3;
import java.util.Scanner;
/**
 *
 * @author Bueno
 */
public class GabrielBueno {
    
    public static int number1, number2;
    
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Digite os números: ");
        
        number1 = in.nextInt();
        number2 = in.nextInt();
        
        if(number1 > 0 && number2 > 0){
            
            System.out.println("O MDC é:");
            
            System.out.println(mcd(number1, number2));
            
        }else{
            
            System.out.println("Informe valores válidos.");
            
        }
    }
    
    public static int mcd(int num1, int num2){
        
        while(num1 != num2){
            
            if(num1 > num2){
                num1 -= num2;
            }else{
                num2 -= num1;
            }
            
        }
        
        return num1;
    }
    
}
