/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uff.ic.lleme.tcc00328.s20201.exercicios.exercicio5;
import java.util.Scanner;
/**
 *
 * @author alanl
 */
public class AlanCavalcante {    
    
    public static void main(String[] args){
        int indice;
        int n1=0;
        int n2=1;
        int n3;
        int cont =2;
        
        Scanner in = new Scanner (System.in);
        System.out.println("Digite o indice do numero a ser descoberto no fibonacci: ");
        indice = in.nextInt();
        if (indice < 1){
            System.out.println("O indice tem que ser positivo");
        }
        else if (indice == 1){
            System.out.println("Indice 1 é o " + n1);
        }
        else if(indice==2){
            System.out.println("Indice 2 é o " + n2);
        }
        else{
            do{
                cont++;
                n3 = n2;
                n2+=n1;
                n1=n3;
                
            }while(cont != indice);
            System.out.println(n2);
            
        }
    }
}
