/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uff.ic.lleme.tcc00328.s20201.exercicios.exercicio8;
import java.util.Scanner;

/**
 *
 * @author theo
 */
public class TheoNovaesMelloDeOliveira {
    public static void main(String[] args){
        boolean primo = true;
        Scanner myObj = new Scanner(System.in);
        System.out.println("Insira o numero a ser testado:\n");
        int numero = myObj.nextInt();
        int i = 2;
        if(numero != 1){
            for(i = 2; i < numero; i++){
                if(numero % i == 0 && numero != 2) {
                    primo = false;
                }
            }
        }else{
            primo = false;
        }
        if (primo) {
            System.out.printf("o numero é primo.\n");
        }else{
            System.out.printf("o numero não é primo.\n");
        }
    }
}
