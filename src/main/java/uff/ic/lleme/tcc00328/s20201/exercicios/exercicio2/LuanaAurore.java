/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uff.ic.lleme.tcc00328.s20201.exercicios.exercicio2;
import java.util.Scanner;
/**
 *
 * @author rjrom
 */
public class LuanaAurore {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Qual o valor de n?");
        int n = in.nextInt(), f = 1;
        
        while(n<0){
            System.out.println("O valor tem de ser positivo. Digite novamente:");
            n = in.nextInt();
        }
        
        if(n==0){
            f = 1;
        }
        else{
            do{
                f = f * n; 
                n--;
            }while(n!=0);
        }
        
        System.out.println("O fatorial é");
        System.out.println(f);
        
    }
}
