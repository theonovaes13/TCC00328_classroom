/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uff.ic.lleme.tcc00328_classroom.s20201.exercicios.exercicio12;
import java.util.Scanner;
/**
 *
 * @author theo
 */
public class TheoNovaesMelloDeOliveira {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        int numero, divisor;
        System.out.println("Insira o número para que sejam calculados seus divisores");
        numero = myObj.nextInt();
        System.out.println("divisores de n:");
        for(int i=1; i < numero; i++){
            if(numero % i == 0){
                divisor = i;
                System.out.println(i + " é divisor de " + numero);
            }
        }
        
    }
}
