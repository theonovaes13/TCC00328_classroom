/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uff.ic.lleme.tcc00328_classroom.s20201.exercicios.exercicio5;

import java.util.Scanner;

/**
 *
 * @author GuiTomaz
 */
public class GuilhermeTomazRA {
    public static void main(String[]args){
        int num;
        Scanner tecla = new Scanner(System.in);
        System.out.println("Informe um numero n para saber qual é este enesimo termo da sequencia fibonacci: ");
        num = tecla.nextInt();
        int resultado = termo(num);
        System.out.println(num+"º termo da sequencia fibonacci " + resultado);
        
    }
    public static int termo(int num){
        int termoN;
        if(num == 1 || num == 0){
            termoN = num;
        }else{
            termoN = termo(num-1) + termo(num-2);
        }
        return termoN;
    }
}
