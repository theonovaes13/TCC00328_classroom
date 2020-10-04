/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uff.ic.lleme.tcc00328.s20201.exercicios.exercicio2;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class GuilhermeTomazRA {
    
    public static void main(String[]args){
        Scanner tecla = new Scanner(System.in); //Criando objeto para receber entrada do usuário
        int num;
        int res;
        System.out.println("Informe um numero para calcular o fatorial: ");
        num = tecla.nextInt();
        res = fatorial(num);
        System.out.println("Resultado: ");
        System.out.println(res);
    }
    
    public static int fatorial(int num){
        int fat = 1;
        int i = num;
        do{
            fat = fat * i;
            i--;
        }while(i>1);
        return fat;
    }
}
