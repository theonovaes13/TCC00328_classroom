/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula2exercicios;

import java.util.Scanner;

/**
 *
 * @author fabio
 */
public class Fibonacci {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o valor de n: ");
        int num = in.nextInt();
        int f_ant = 0;
        int f_atual = 1;
        int f_prox;
        int i = 1;
        System.out.printf("%d ",f_ant);
        System.out.printf("%d ", f_atual);
        while(i < num){
            f_prox = f_ant + f_atual;
            f_ant = f_atual;
            f_atual = f_prox;
            i = i+1;
            System.out.printf("%d ",f_atual);
        }
    }
}
