/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uff.ic.lleme.tcc00328_classroom.s20201.exercicios.exercicio5;
import java.util.Scanner;
/**
 *
 * @author Bueno
 */
public class GabrielBueno {
       
    public static int value;
    
    public static int num = 0;
    
    public static int prev1 = 0;
    
    public static int prev2 = 1;
    
    public static int mid ;
    
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Digite o termo desejado:");
        
        value = in.nextInt();
        
        System.out.println(fibo(value));
        
    }
    
    public static int fibo(int value){
        
        if(value == 2){
            return 1;
        }
        
        while(value > 2){
            
            num = prev1 + prev2;
            
            mid = prev2;
            
            prev2 = num;
            
            prev1 = mid;
            
            value--;
            
        }
        
        return num;
    }
}
