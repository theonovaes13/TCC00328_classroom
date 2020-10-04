/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uff.ic.lleme.tcc00328.s20201.exercicios.exercicio4;
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
        
        if (n > 0) {
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
        
        switch (n) {
            case 1:
                return false;
            case 2:
                return true;
            default:
                do {
                    if (n % i == 0) {
                        return false;
                    }
                    i++;
                } while (i < n / 2 + 1);
        }
        
        return true;
    }
}
