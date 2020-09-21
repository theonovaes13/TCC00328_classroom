/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uff.ic.lleme.tcc00328_classroom.s20201.exercicios.exercicio2;
import java.util.Scanner;
/**
 *
 * @author theo
 */
public class TheoNovaesMelloDeOliveira {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Insira o número que deseja calcular o Fatorial");
        int fatorial = numero.nextInt();
        int fatorial2 = fatorial;
        do {
            fatorial -= 1;
            fatorial2 *= fatorial;
        }
        while (fatorial > 1);
        System.out.printf("O valor do fatorial é: %d \n", fatorial2);
}}
