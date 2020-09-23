/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uff.ic.lleme.tcc00328_classroom.s20201.exercicios.exercicio7;

import java.util.*;

/**
 *
 * @author fabio
 */
public class FabioSCPaulo {
    
    public static void main(String[] args) { 
       
        Scanner in = new Scanner(System.in);
        System.out.println("Digite um numero inteiro: ");
        int x = in.nextInt();
        System.out.println("Digite um numero inteiro: ");
        int y = in.nextInt();
        
        int resto;
        for(int i=y;i>0;i--){
            if(y>0){
                resto = x%y;
                x = y;
                y = resto;
            }else i=0;
        }
        System.out.printf("%d \n",x);

    }
}