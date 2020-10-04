/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uff.ic.lleme.tcc00328.s20201.exercicios.exercicio12;

/**
 *
 * @author alanl
 */
public class AlanCavalcante {
    public static void main(String[] args){
        int n=1;
        divisores(n);
        n=5;
        divisores(n);
        n=8;
        divisores(n);
        n=24;
        divisores(n);
        
    }
    public static void divisores(int n){
     
        for(int i=1; i<=n; i++){
            if(n%i==0){
                System.out.println(n+" é divisivel por "+i);
            }
        }
         System.out.println("---------------------------------------------------------------------------");
    }
    
}
