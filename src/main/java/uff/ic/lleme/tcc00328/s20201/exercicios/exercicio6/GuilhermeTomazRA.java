/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uff.ic.lleme.tcc00328.s20201.exercicios.exercicio6;

import java.util.Scanner;

/**
 *
 * @author GuiTomaz
 */
public class GuilhermeTomazRA {
    public static void main(String[]args){
        Scanner tecla = new Scanner(System.in);
        System.out.println("Informe um numero n: ");
        int numero = tecla.nextInt();
        double resultado = somatorio(numero);
        System.out.println("resultado: " + resultado);
    }
    
    public static double somatorio(int num){
        double somatorio = 0;
        int i = 0;
        do{
            somatorio += (double) Math.pow(-1,i)/(2*i+1) * 4;
            i++;
        }while(i<=num);
        return somatorio;
    }
}
