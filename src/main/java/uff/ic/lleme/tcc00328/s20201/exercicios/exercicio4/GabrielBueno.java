/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uff.ic.lleme.tcc00328.s20201.exercicios.exercicio4;
import java.util.Scanner;
/**
 *
 * @author Bueno
 */
public class GabrielBueno {
    
    public static int number;
    
    public static int limit = 2;
    
    public static void main(String[] args){
    
        Scanner in = new Scanner(System.in);
        
        System.out.println("Digite o número: ");
        
        number = in.nextInt();
        
        String result = isPrime(number);
        
        System.out.println(result);
        
    }
    
    public static String isPrime(int num){
        
        if(num > 1){
            
            while(limit <= Math.sqrt(num)){
                
                if(num % limit == 0){
                    return "Não é primo.";
                }
                
                limit ++;
            }
            
            return "É primo";
            
        }
        
        return "Informe um valor válido";
    }
}
