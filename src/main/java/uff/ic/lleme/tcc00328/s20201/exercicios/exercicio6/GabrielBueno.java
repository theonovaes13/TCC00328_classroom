/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uff.ic.lleme.tcc00328.s20201.exercicios.exercicio6;
import java.util.Scanner;
/**
 *
 * @author Bueno
 */
public class GabrielBueno {
    
    public static void main(String[] args){
        int n ;
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Digite o número:");
        
        n = in.nextInt();
        
        System.out.println(sum(n));
        
    }
    
    public static double sum(int value){
        double E = 0;
        int i = 0 ;
        
        while(i <= value - 1){
        
            E += Math.pow(-1, i)/(2*i + 1);
            
            i++;
            
        }
        
        E *= 4;
        
        return E;
    }
}
