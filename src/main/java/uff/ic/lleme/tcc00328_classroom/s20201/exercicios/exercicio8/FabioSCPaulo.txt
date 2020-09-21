/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uff.ic.lleme.tcc00328_classroom.s20201.exercicios.exercicio8;

import java.util.*;

/**
 *
 * @author fabio
 */
public class FabioSCPaulo {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite um numero inteiro: ");
        int num = in.nextInt();
        int cont = 0;
        if(num==1)System.out.println("Não primo");
        else{
            for(int divisor=2;divisor<num;divisor++){
                if (num%divisor==0){
                    cont++;
                }
            }
            if(cont==0) System.out.println("Primo");
            else System.out.println("Não primo");
        }
    }
}