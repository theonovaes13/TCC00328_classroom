
package uff.ic.lleme.tcc00328_classroom.s20201.exercicios.exercicio3;

import java.util.Scanner;

public class LumaGonzaga {

    public static void main(String[] args) {
        int x, y, r, a, b;
      
        Scanner in = new Scanner(System.in);
        System.out.println("Digite os números inteiros e pares: ");
        x = in.nextInt();
        y = in.nextInt();
        a = x;
        b = y;
        if (y>x){
            x = y;
            y = a;
        }
        do {
            r = x % y;
            x = y;
            y = r; 
        }while(r != 0);
        System.out.println(" e " + "O MDC entre " + a + " e " + b + " é: " + x);
    }
}
        