/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uff.ic.lleme.tcc00328_classroom.s20201.exercicios.exercicio4;
import java.util.Scanner;

/**
 *
 * @author lucca
 */
public class LuccaSabbatini {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Digite o número:");
        int n = in.nextInt();
        
        if (n > 1) {
            if (isPrimo(n)) {
                System.out.println("O número é primo.");
            } else {
                System.out.println("O número NÃO é primo.");
            }
        } else {
            System.out.println("ERRO: Digite um número positivo e inteiro.");
            System.exit(0);
        }
    }
    
    public static boolean isPrimo(int n) {        
        int i = 2;
        
        if (n == 2) {
            return true;
        } else {
            do {
                if (n % i == 0) {
                    return false;
                }
                i++;
            } while (i < n / 2);
        }
        
        return true;
    }
}
