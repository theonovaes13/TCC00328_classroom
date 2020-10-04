/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uff.ic.lleme.tcc00328.s20201.exercicios.exercicio9;

/**
 *
 * @author alanl
 */
public class AlanCavalcante {
    public static void main(String[] args){
        int pos=1;
        fib(pos);
        pos=2;
        fib(pos);
        pos=4;
        fib(pos);
        pos=8;
        fib(pos);
        
    }
    public static void fib(int pos){
        int n1=1, n2=0, auxiliar;
        for(int i=1; i<=pos;i++){
            System.out.println("pos="+i+" valor="+n1);
            auxiliar = n1;
            n1+=n2;
            n2=auxiliar;
            
        }
        System.out.println("---------------------------------------------------------------------------");
    }
    
}
