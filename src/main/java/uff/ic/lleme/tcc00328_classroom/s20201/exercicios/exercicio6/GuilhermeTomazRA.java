/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uff.ic.lleme.tcc00328_classroom.s20201.exercicios.exercicio6;

/**
 *
 * @author User
 */
public class GuilhermeTomazRA {
    public static void main(String[]args){
        int numero = 2;
        double resultado = somatorio(2);
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
