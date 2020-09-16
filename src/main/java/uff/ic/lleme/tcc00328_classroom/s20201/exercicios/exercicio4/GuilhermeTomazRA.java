/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uff.ic.lleme.tcc00328_classroom.s20201.exercicios.exercicio4;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class GuilhermeTomazRA {
    public static void main(String[]args){
        Scanner tecla = new Scanner(System.in);
        int num;
        System.out.println("Informe um numero: ");
        num = tecla.nextInt();
       if(VerificaPrimo(num) || num ==2){
           System.out.println("Numero eh primo!");
       }else{
           System.out.println("Numero NAO eh primo!");
       }
        
    }
    public static boolean VerificaPrimo(int numero){
        int aux = 2;
        boolean primo = true;
        do{
          if(numero % aux == 0){
              primo = false;
              break;
          } 
          aux++;
        }while(aux<numero/2);
        return primo;
    }
            
}
