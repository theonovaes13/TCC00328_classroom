/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uff.ic.lleme.tcc00328_classroom.s20201.exercicios.exercicio16;
import java.util.Scanner;
import java.util.Arrays; 
import java.util.Comparator;
/**
 *
 * @author theo
 */
public class TheoNovaesMelloDeOliveira {
    public static void main(String[] args){
        int numtimes;
       
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira por gentileza o numero de times: ");
        numtimes= sc.nextInt();
        int[][] matriz = new int[numtimes][6];
        //        vamos preencher a tabela com o numero de times:
        for(int i=0; i< numtimes; i++){
            matriz[i][0] = i+1;
            for(int j=1; j<6; j++){
                System.out.println("Por favor, insira o item "+ (j) +" do time " + (i+1));
                matriz[i][j] = sc.nextInt();
            }
        }        
        //        com os times formados, vamos ordenar:
        Arrays.sort(matriz, Comparator.<int[]>comparingInt(a -> a[1]).thenComparingInt(a -> a[2]).thenComparingInt(a -> a[3]).thenComparingInt(a -> a[4]).thenComparingInt(a -> a[5]));
        /*Eu poderia ordenar de forma oposta, colocando o primeiro lugar na primeira colocação
          Mas como a questão apenas pede a informação de output do primeiro lugar apenas isso importa.       
        */
        System.out.println("O número do time campeão é: "+matriz[numtimes-1][0]);
        System.out.println("A ordem dos times é: ");
        for(int k = numtimes-1; k>=0; k--){
            System.out.println(Arrays.toString(matriz[k]));
        }
    }
}
