/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uff.ic.lleme.tcc00328_classroom.s20201.exercicios.exercicio7;

/**
 *
 * @author GuiTomaz
 */
public class GuilhermeTomazRA {
     public static void main(String[]args){
        int mdc;
        mdc = MDC(42, 24);
        System.out.println("Resultado: " + mdc);
        mdc = MDC(42, 23);
        System.out.println("Resultado: " + mdc);
        mdc = MDC(9, 18);
        System.out.println("Resultado: " + mdc);
        mdc = MDC(24, 48);
        System.out.println("Resultado: " + mdc);
        mdc = MDC(18, 60);
        System.out.println("Resultado: " + mdc);
        
        
        
    }
     
     public static int MDC(int x, int y){
        int r;
        int mdc;
        for(r = x % y; r!=0; r=x%y){
            if(r!=0){
                x = y;
                y = r;
            }
        }
        mdc = y;
        return mdc;
    }
}


