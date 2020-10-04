/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uff.ic.lleme.tcc00328.s20201.exercicios.exercicio7;

/**
 *
 * @author alanl
 */
public class AlanCavalcante {
    public static void main(String[] args){
        mdc(1,4);
        mdc(5,25);
        mdc(100,48);
        
        
    }
    public static void mdc(int n1, int n2){
        
        if(n1 < n2){
            int troca;
            troca = n1;
            n1= n2;
            n2 = troca;
        }
        System.out.println("O MDC de "+n1+" e "+ n2 + " é :");
        
         for(int resto = n1%n2;resto != 0; resto = n1%n2){
            n1 = n2;
            n2 = resto;
        }
         
        System.out.println(n2);
        System.out.println("--------------------------------");
    }
}
