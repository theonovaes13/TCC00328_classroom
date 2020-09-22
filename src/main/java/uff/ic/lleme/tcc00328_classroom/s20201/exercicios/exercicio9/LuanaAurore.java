/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uff.ic.lleme.tcc00328_classroom.s20201.exercicios.exercicio9;
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
        System.out.println("Fibonacci é " + fib(n));
    }
    public static int fib(int n){
        if(n==0) return 0;
        if(n==1) return 1;
        
        int soma = 1, fib1 = 0, fib2 = 1;
       
        for(int cont = 3; cont <=n; cont++){
            soma = fib1 + fib2;
            fib1 = fib2;
            fib2 = soma;
        }
        return soma;
    }
}
