/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uff.ic.lleme.tcc00328_classroom.s20201.exercicios.exercicio4;
import java.util.Scanner;
/**
 *
 * @author alanl
 */
public class AlanCavalcante {
    
    public static void main(String[] args){
        int n1;
        int n2=0;
        int cont = 0;
        Scanner in = new Scanner (System.in);
        System.out.println("Digite um numero: ");
        n1 = in.nextInt();
        
        do {
            n2++;
            if (n1 % n2 == 0){
                cont++;
            }
		}while(n2!=n1 && cont < 3);
       
        if (cont == 2){
            System.out.println("O numero digitado é primo");
        }
        else{
            System.out.println("O numero digitado não é primo");
        }
     }
}
