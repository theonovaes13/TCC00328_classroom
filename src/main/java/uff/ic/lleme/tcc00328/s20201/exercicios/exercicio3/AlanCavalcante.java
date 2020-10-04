/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uff.ic.lleme.tcc00328.s20201.exercicios.exercicio3;
import java.util.Scanner;
/**
 *
 * @author alanl
 */
public class AlanCavalcante {
    
    public static void main(String[] args) {
        int n1, n2, troca, resto;
        Scanner in = new Scanner (System.in);
        System.out.println("Digite o 1 numero no mdc ");
        n1 = in.nextInt();
        System.out.println("Digite o 2 numero no mdc ");
        n2 = in.nextInt();
        if(n1 < n2){
            troca = n1;
            n1= n2;
            n2 = troca;
        }
        System.out.println("O MDC de "+n1+" e "+ n2 + " é :");
        do{
           resto = n1%n2;
           n1 = n2;
           n2 = resto;
        }while(resto!=0);
        System.out.println(n1);
        
    }
}
