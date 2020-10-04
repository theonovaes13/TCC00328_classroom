/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uff.ic.lleme.tcc00328.s20201.exercicios.exercicio7;
import java.util.Scanner;
/**
 *
 * @author rjrom
 */
public class LuanaAurore {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Qual o valor de x?");
        int x = in.nextInt();
        System.out.println("Qual o valor de y?");
        int y = in.nextInt();
        
        System.out.println("O MDC é:");
        System.out.println(mdc(x, y));
    }
    public static int mdc(int x, int y){
        if((x == y+1)||(y == x+1)){
            return 1; // números consecutivos, o mdc é 1
        }
        else if(x%y == 0){
            return y;   // y é divisor de x logo é o mdc
        }
        else if(y%x == 0){
            return x;   // x é divisor de y logo é o mdc
        }
        int temp;
        if (y > x){
            temp = x;
            x = y;
            y = temp; 
        } // botando os numeros em ordem decrescente
        for(temp = x%y; temp!=0; temp = x%y){
            x = y;
            if(temp!=0) y = temp;
        }
        return y;
    }
}
