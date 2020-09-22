/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uff.ic.lleme.tcc00328_classroom.s20201.exercicios.exercicio13;

import java.util.Scanner;

/**
 *
 * @author GuiTomaz
 */
public class GuilhermeTomazRA {
    public static void main(String[] args){
        Scanner tecla = new Scanner(System.in);
        int n;
        System.out.println("Informe um numero N de valores: ");
        n = tecla.nextInt();
        float valor;
        float soma = 0;
        for(int i = 0;i<n;i++){
            System.out.println("Valor ["+i+"]: ");
            valor = tecla.nextFloat();
            soma += valor;
        }
        float media = soma / n;
        System.out.println("Media: "+media);
    }
}
