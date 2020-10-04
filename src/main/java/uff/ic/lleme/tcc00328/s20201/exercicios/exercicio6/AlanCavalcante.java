/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uff.ic.lleme.tcc00328.s20201.exercicios.exercicio6;
import java.util.Scanner;
/**
 *
 * @author alanl
 */
public class AlanCavalcante {
    public static void main (String[] args){
        int i = 0;
        double res = 0;
        
        Scanner in = new Scanner(System.in); //criando objeto para leitura do teclado
        System.out.println("Digite a quantidade de vezes que deseja somar: ");
        int quantidade = in.nextInt();
        
        do{
            res += (Math.pow(-1,i) / (2 * i + 1));
            i++;
        }while(i  <  quantidade);
        res*=4;
        System.out.println("RES: " + res);
    } 
}
