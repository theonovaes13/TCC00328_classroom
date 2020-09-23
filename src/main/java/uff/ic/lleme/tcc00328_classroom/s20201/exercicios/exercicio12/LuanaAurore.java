/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uff.ic.lleme.tcc00328_classroom.s20201.exercicios.exercicio12;
import java.util.Scanner;
/**
 *
 * @author rjrom
 */
public class LuanaAurore {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Qual valor de n?");
        int n = in.nextInt();
        System.out.println("Os divisores são:");
        div(n);
        
    }
    public static void div(int n){
        for(int i = 1; i <= n; i++){
            if(n%i == 0) System.out.println(i);
        }
    }
}
