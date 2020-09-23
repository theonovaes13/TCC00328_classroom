/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uff.ic.lleme.tcc00328_classroom.s20201.exercicios.exercicio7;
import java.util.Scanner;

/**
 *
 * @author lucca
 */
public class LuccaSabbatini {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Digite o primeiro número:");
        int n1 = in.nextInt();
        System.out.println("Digite o segundo número:");
        int n2 = in.nextInt();
        
        if (n1 > 0 && n2 > 0) {
            System.out.println("Resultado: " + mdc(sortDecrescente(n1, n2)));
        } else {
            System.out.println("ERRO: Escolha 2 números inteiros positivos.");
            System.exit(0);
        }
    }
    
    public static int mdc(int[] data) {
        int a = data[0], b = data[1];
        
        for (int r = a % b; r != 0; r = a % b) {
            a = b;
            b = r;
        }
        
        return b;
    }
    
    public static int[] sortDecrescente(int a, int b) {
        if (b > a) {
            int aux = a;
            a = b;
            b = aux;
        }
        
        int[] res = {a, b}; 
        return res;
    }
}
