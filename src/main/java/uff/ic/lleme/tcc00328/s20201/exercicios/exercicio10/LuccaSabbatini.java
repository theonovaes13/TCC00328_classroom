/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uff.ic.lleme.tcc00328.s20201.exercicios.exercicio10;
import java.util.Scanner;

/**
 *
 * @author lucca
 */
public class LuccaSabbatini {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Digite o número de termos para o cálculo da série:");
        int n = in.nextInt();
        
        if (n > 0) {
            System.out.println("Resultado: " + calcSeries(n));
        } else {
            System.out.println("ERRO: Digite um número maior que zero.");
            System.exit(0);
        }
    }
    
    public static double calcSeries(int n) {
        double res = 0;
        
        for (int i = 0; i < n; i++) {
            res += Math.pow(-1, i) / ((2 * i) + 1);
        }
        
        return 4 * res;
    }
}
