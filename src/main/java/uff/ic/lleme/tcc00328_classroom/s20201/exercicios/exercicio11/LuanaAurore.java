/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uff.ic.lleme.tcc00328_classroom.s20201.exercicios.exercicio11;

/**
 *
 * @author rjrom
 */
public class LuanaAurore {
    public static void main(String[] args) {
        long prod = 1;
        for(int i = 1; i < 50; i++){
            if(primo(i))
                prod *= i;
            System.out.println(prod);
        }
        System.out.println("O produto é = " + prod);
    }
    public static boolean primo(int n){
        if (n == 1) return false;
        if (n == 2) return true;
        int i = 2;
        do{
            if(n%i ==0) return false;
            i++;
        }while(i < n);
        return true;
    }
}
