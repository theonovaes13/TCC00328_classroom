/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uff.ic.lleme.tcc00328_classroom.s20201.exercicios.exercicio9;

import java.util.*;

/**
 *
 * @author fabio
 */
public class FabioSCPaulo {
    
    public static void main(String[] args) { 
       
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o valor de n: ");
        int num = in.nextInt();
        int f_ant = 0;
        int f_atual = 1;
        int f_prox;
        System.out.printf("%d ",f_ant);
        System.out.printf("%d ", f_atual);
        for(int i=1;i < num;i++){
            f_prox = f_ant + f_atual;
            f_ant = f_atual;
            f_atual = f_prox;
            System.out.printf("%d ",f_atual);
        }

    }
}