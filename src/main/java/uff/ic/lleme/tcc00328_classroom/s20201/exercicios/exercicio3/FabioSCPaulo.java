/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uff.ic.lleme.tcc00328_classroom.s20201.exercicios.exercicio3;

import java.util.*;

/**
 *
 * @author fabio
 */
public class FabioSCPaulo {
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        System.out.println("Digite um numero inteiro: ");
        int x = in.nextInt();
        System.out.println("Digite um numero inteiro: ");
        int y = in.nextInt();
        boolean m = true;
        int atual,retorno =0;
        
        do{
            if ((y<=x) && ((x%y)==0)){
               retorno = y;
               m = false;
            }else if(x<y){
                atual = x;
                x = y;
                y = atual;
            }else{
                atual = y;
                y = x%y;
                x = atual;
            }
        }while(m);
        
        System.out.printf("%d \n",retorno);
    }
}
