/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mdc;
import java.util.Scanner;
/**
 *
 * @author theo
 */
public class MDC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a, b;
        Scanner input = new Scanner (System.in);
        System.out.println("Por favor insira os dois numeros para calcular o MDC. aperte enter entre um e outro:\n");
        int numero1 = input.nextInt();
        int numero2 = input.nextInt();
        int resto;
        do{
            resto = numero1 % numero2;
            numero1 = numero2;
            numero2 = resto;
        }
        while(numero2 != 0);
        System.out.printf("O numero divisor comum é %d", numero1);
   
    }
    
}
