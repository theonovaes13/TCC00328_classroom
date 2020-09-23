/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uff.ic.lleme.tcc00328_classroom.s20201.exercicios.exercicio11;

/**
 *
 * @author lucca
 */
public class LuccaSabbatini {
    public static void main(String[] args) {      
        long res = 1;
        
        for (int i = 1; i < 50; i++) {
            if (isPrimo(i)) {
                res *= i;
            }
        }
        
        System.out.println("Produto dos inteiros primos entre 1 e 50: " + res);
    }
    
    public static boolean isPrimo(int n) {        
        switch (n) {
            case 1:
                return false;
            case 2:
                return true;
            default:        
                for (int i = 2; i < n / 2 + 1; i++) {
                    if (n % i == 0) {
                        return false;
                    }
                }
        }
        
        return true;
    }
}
