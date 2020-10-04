/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uff.ic.lleme.tcc00328.s20201.exercicios.exercicio13;
import java.util.Scanner;
/**
 *
 * @author Bueno
 */
public class GabrielBueno {
    public static void main(String args[]){
        int n, i;
        float value = 0f;
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Digite o valor de n ");
        
        n = in.nextInt();
        
        for(i = 0; i<n; i++){
            System.out.println("Digite o valor: ");
            value += in.nextFloat();
            
        }
        System.out.println("A média é:");
        System.out.println(value/n);
    }
}
