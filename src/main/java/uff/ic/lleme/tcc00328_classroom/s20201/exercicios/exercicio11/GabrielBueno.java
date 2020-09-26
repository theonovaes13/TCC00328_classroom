/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uff.ic.lleme.tcc00328_classroom.s20201.exercicios.exercicio11;
/**
 *
 * @author Bueno
 */
public class GabrielBueno {
    
    public static void main(String[] args){
        int i;
        long prod = 1;
        
        for(i = 1; i<=50; i++){
            if(isPrime(i) == 1){
                prod *= i;
            }
        }
        
        System.out.println(prod);
        
    }
    
    public static int isPrime(int num){
        int limit = 2;
        if(num > 1){
            
            while(limit <= Math.sqrt(num)){
                
                if(num % limit == 0){
                    return 0;
                }
                
                limit ++;
            }
            
            return 1;
            
        }else if(num == 1){
            return 0;
        }
        
        return 0;
    }
}
