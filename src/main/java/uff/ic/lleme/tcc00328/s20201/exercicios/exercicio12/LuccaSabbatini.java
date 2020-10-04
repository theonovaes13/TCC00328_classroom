/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uff.ic.lleme.tcc00328.s20201.exercicios.exercicio12;
import java.util.Scanner;

/**
 *
 * @author lucca
 */
public class LuccaSabbatini {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Digite um número para o cálculo de seus divisores:");
        int n = in.nextInt();
        
        if (n > 0) {
            divisores(n);
        } else {
            System.out.println("ERRO: Digite um número maior que 0");
            System.exit(0);
        }
    }
    
    public static void divisores(int n) {
        System.out.println("Divisores de " + n + ": ");
        
        for (int i = 1; i <= n / 2 + 1; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }
        
        System.out.println(n);
    }
}
