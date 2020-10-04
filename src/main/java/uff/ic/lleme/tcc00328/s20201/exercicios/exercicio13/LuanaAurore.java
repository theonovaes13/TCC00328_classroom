/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uff.ic.lleme.tcc00328.s20201.exercicios.exercicio13;
import java.util.Scanner;
/**
 *
 * @author rjrom
 */
public class LuanaAurore {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Quantos valores?");
        int n = in.nextInt();
        int med = 0;
        for(int i = 0; i < n; i++){
            System.out.println("Insira valor:");
            int a = in.nextInt();
            med += a;
        }
        med = med / n;
        System.out.println("A média é " + med);
    }
}
