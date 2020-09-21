/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uff.ic.lleme.tcc00328_classroom.s20201.exercicios.exercicio11;
import java.util.Scanner;
/**
 *
 * @author theo
 */
public class TheoNovaesMelloDeOliveira {
    public static void main(String[] args){
        int numeroTestado=2, contadorPrimo=2;
        long resultado = 2;
        boolean primo = true;
        do{
            primo = true;
//            System.out.println("numero: "+ numeroTestado + " ANTES: "+ primo + "\n");
            do{
//                System.out.println( numeroTestado + " %"+ contadorPrimo +"="+ numeroTestado % contadorPrimo);
                if(numeroTestado % contadorPrimo == 0 && numeroTestado != 2 ) {
                    primo = false;
                }
                contadorPrimo += 1;
            }while(contadorPrimo < numeroTestado);
//            System.out.println("DEPOIS: "+ primo + "\n\n\n");
            if (primo) {
                System.out.println(numeroTestado + " É PRIMO! multiplicando!\n" + resultado + "*" + numeroTestado + "=" + resultado*numeroTestado+"\n");
                resultado = resultado * numeroTestado;
            }   
            numeroTestado+=1;
            contadorPrimo = 2;
        }while(numeroTestado < 50);
        
        System.out.println("O resultado final é:" + resultado);
    }
}
