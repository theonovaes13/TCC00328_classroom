/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uff.ic.lleme.tcc00328_classroom.s20201.exercicios.exercicio6;
import java.util.Scanner;
/**
 *
 * @author rjrom
 */
public class LuanaAurore {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Valor de n:");
        int n = in.nextInt();
        System.out.println("O somatório é igual a " + soma(n));
    }
    public static double soma(int n){
        double s = 0;
        int i = 0;
        do{
            s += (Math.pow(-1, i))/(2*i + 1);
            i++;
        }while(i < n);
        
        return 4*s;
    }
}
