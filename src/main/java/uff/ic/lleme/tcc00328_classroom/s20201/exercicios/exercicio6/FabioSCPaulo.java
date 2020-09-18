/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula2exercicios;

import java.util.Scanner;

/**
 *
 * @author fabio
 */
public class Series {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Defina n>=1: ");
        int n = in.nextInt();
        double acumulador =0.0f;
        for(int i=0;i<n;i++){
            double temp = (double)i;
            
            if(i==0){
                acumulador += 1.0f;
            }
            else if((i%2)==0){
                acumulador += (double)1/(temp+2);
            }else{
                acumulador -= (double) 1/(temp+2);
            }  
        }
        acumulador *= 4;
        System.out.printf("\n%f",acumulador);
    }
}
