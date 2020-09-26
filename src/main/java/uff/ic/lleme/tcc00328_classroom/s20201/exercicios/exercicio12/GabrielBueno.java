/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uff.ic.lleme.tcc00328_classroom.s20201.exercicios.exercicio12;

/**
 *
 * @author Bueno
 */
public class GabrielBueno {
    
    public static void main(String args[]){
        int n = 100;
        double i;
    
        for(i = 1.0; i<=n/2; i++){
            if(n%i == 0){
                System.out.println(i);
            }
        }
        
        System.out.println(n);
    }
}
