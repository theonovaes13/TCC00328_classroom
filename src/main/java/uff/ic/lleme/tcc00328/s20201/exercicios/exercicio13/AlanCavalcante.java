/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uff.ic.lleme.tcc00328.s20201.exercicios.exercicio13;
import java.util.Scanner;
/**
 *
 * @author alanl
 */
public class AlanCavalcante {
    public static void main(String[] args){
        double res=0, valor;
        int quantidade;
        Scanner in = new Scanner (System.in);
        System.out.println("Digite a quantidade de valores que serão inseridos: ");
        quantidade = in.nextInt();
        for(int i=0; i< quantidade; i++){
            System.out.println("Digite o "+(i+1)+"° numero a ser somado");
            valor = in.nextDouble();
            res+=valor;
        }
        res/=quantidade;
        System.out.println("A média dos números digitados foi "+ res);
        
    }
    
}
