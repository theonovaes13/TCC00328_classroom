/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uff.ic.lleme.tcc00328.s20201.exercicios.exercicio9;
import java.util.Scanner;

/**
 *
 * @author lucca
 */
public class LuccaSabbatini {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Digite o índice:");
        int i = in.nextInt();
        
        if (i >= 0) {
            System.out.println("Termo de Fibonacci do índice informado: " + fibonacci(i));
        } else {
            System.out.println("ERRO: Digite um número maior ou igual a 0");
            System.exit(0);
        }
    }
    
    public static int fibonacci(int i) {
        int a = 0, b = 1, c = 0;
        
        switch (i) {
            default:
                for (int count = 2; count <= i; count++) {
                    c = a + b;
                    a = b;
                    b = c;
                }
                return c;
            case 0:
                return 0;
            case 1:
                return 1;
        }
    }
}
