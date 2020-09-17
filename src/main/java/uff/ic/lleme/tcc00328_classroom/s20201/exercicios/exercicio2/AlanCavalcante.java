/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uff.ic.lleme.tcc00328_classroom.s20201.exercicios.exercicio2;
import java.util.Scanner;

/**
 *
 * @author alanl
 */
public class AlanCavalcante {
    
    public static void main(String[] args){
        int n;
        
        Scanner in = new Scanner (System.in);
        System.out.println("Digite o numero que deseja saber seu fatorial: ");
        n = in.nextInt();
        fat(n);
      
    }
    public static void fat(int n){
        int fat=1;
        System.out.println("Fatorial de "+ n+"!");
         do{
            fat*=n--;
        }while(n!=1);
        System.out.println("é "+ fat);
    }
}
