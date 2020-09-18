/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uff.ic.lleme.tcc00328_classroom.s20201.exercicios.exercicio3;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class GuilhermeTomazRA {
    public static void main(String[]args){
        int n1;
        int n2;
        int resultado;
        Scanner tecla = new Scanner(System.in);
        System.out.println("Informe o primeiro numero: ");
        n1 = tecla.nextInt();
        System.out.println("Informe o segundo numero: ");
        n2 = tecla.nextInt();
        resultado = MDC(n1, n2);
        System.out.println("Resultado: " + resultado);
        
        
    }
    public static int MDC(int x, int y){
        int r;
        int mdc;
        do{
            r = x % y;
            if(r != 0){
              x = y;
              y=r;
            }
        }while(r != 0);
        mdc = y;
        return mdc;
    }
}
