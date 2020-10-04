/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uff.ic.lleme.tcc00328.s20201.exercicios.exercicio2;
import java.util.Scanner;

/**
 *
 * @author Bueno
 */
public class GabrielBueno {
    
    public static int res = 1;
    
    public static int number;
        
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Digite o número: ");
        
        number = in.nextInt();
        
        if(number >= 0){
            
            System.out.println("O fatorial é: ");
        
            System.out.println(fat(number));
           
        }else{
            
            System.out.println("Não é possível calcular o fatorial. Informe um valor válido.");
            
        }
 
    }
    
    public static int fat(int n){
        
        if(n == 0){
            return 1;
        }
        
        while(n != 1){
            res *= n;
            n --;
        }
    
        return res;
        
    }
}
