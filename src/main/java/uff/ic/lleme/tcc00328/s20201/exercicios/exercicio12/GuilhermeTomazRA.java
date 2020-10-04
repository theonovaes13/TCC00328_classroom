/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uff.ic.lleme.tcc00328.s20201.exercicios.exercicio12;

/**
 *
 * @author User
 */
public class GuilhermeTomazRA {
    public static void main(String[] args){
        System.out.println("Hello world!");
        divisores(36);
        divisores(15);
        divisores(37);
        divisores(29);
        divisores(100);
        divisores(81);
        divisores(54);
        //Teste casos invalidos N<0
        divisores(-54);
        divisores(-3);
        divisores(-1);
    }
    public static void divisores(int n){
        System.out.print("Divisores de "+n+": ");
        if(n>0){
            for(int i = 1;i<=n;i++){
                if(n%i == 0){
                    System.out.print(i + " ");
                }
            }
        }else{
            System.out.println("Invalido. N<0");
        }
        System.out.println(" ");
    }
        
   }
