/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uff.ic.lleme.tcc00328_classroom.s20201.exercicios.exercicio9;

import java.util.Scanner;

/**
 *
 * @author theo
 */
public class TheoNovaesMelloDeOliveira {
    public static void main(String[] args){
        int a, b, contador, n;
        a = 0; b = 0; contador = 1;
        Scanner myObj = new Scanner(System.in);
        System.out.println("Este programa calcula o enésimo termo de uma sequencia de fibonacci. \n insira o valor de n: \n");
        n = myObj.nextInt();
        for(contador=1; contador <=n; contador++){
            if(contador == 1){
                a = 1;
            }else{
                a +=b;
                b = a-b;
            }
        }
            
       
        System.out.printf("O %dº termo da sequência é %d\n", n, a);
    }
}
