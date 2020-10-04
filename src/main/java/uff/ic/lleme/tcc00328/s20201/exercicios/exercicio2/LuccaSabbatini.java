/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uff.ic.lleme.tcc00328.s20201.exercicios.exercicio2;
import java.util.Scanner;

/**
 *
 * @author lucca
 */
public class LuccaSabbatini {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o número inteiro para o cálculo de fatorial:");
        int n = in.nextInt();
        System.out.println(fatorial(n));
    }
    
    public static int fatorial(int n) {
        int res = n;
        
        if (n > 1) {
            do {
                res *= n-1;
                n--;
            }
            while (n > 1);
        } else if (n == 0 || n == 1) {
            res = 1;
        } else {
            System.out.println("ERRO: Digite um número natural.");
            System.exit(0);
        }
        
        return res;
    }
}
