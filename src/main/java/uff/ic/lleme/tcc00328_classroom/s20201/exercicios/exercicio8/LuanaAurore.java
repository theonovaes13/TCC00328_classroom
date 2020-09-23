/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uff.ic.lleme.tcc00328_classroom.s20201.exercicios.exercicio8;
import java.util.Scanner;
/**
 *
 * @author rjrom
 */
public class LuanaAurore {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Qual número?");
        int n = in.nextInt();
        if(primo(n)) System.out.println(n + " é primo");
        else System.out.println(n + " não é primo");
    }
    public static boolean primo(int n){
        if (n == 1) return false;
        if (n == 2) return true;
      
        for(int i = 2; i < n; i++){
            if(n%i ==0) return false;
        }
        return true;
    }
}
