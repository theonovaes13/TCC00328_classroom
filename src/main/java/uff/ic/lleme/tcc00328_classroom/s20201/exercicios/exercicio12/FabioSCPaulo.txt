/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uff.ic.lleme.tcc00328_classroom.s20201.exercicios.exercicio12;

import java.util.*;

/**
 *
 * @author fabio
 */
public class FabioSCPaulo {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite um numero n>0: ");
        int num = in.nextInt();
        int divisor = 1;
        while(divisor<num){
            if (num%divisor==0){
                System.out.printf("%d \n",divisor);
            }
            divisor++;
        
        }
        System.out.printf("%d \n",num);
    }
}