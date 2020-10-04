/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uff.ic.lleme.tcc00328.s20201.exercicios.exercicio10;

/**
 *
 * @author User
 */
public class GuilhermeTomazRA {
    public static void main(String[] args){
        
        int num = 3;
        double resultado = somatorio(num);
        System.out.println("resultado: " + resultado);
        
        num = 5;
        resultado = somatorio(num);
        System.out.println("resultado: " + resultado);
        
        num = 7;
        resultado = somatorio(num);
        System.out.println("resultado: " + resultado);
    }
    
    public static double somatorio(int num){
        double somatorio = 0;
        int i = 0;
        for(i = 0;i<=num;i++){
            somatorio += (double) Math.pow(-1,i)/(2*i+1);
        }
        somatorio = somatorio * 4;
        return somatorio;
    }
}
