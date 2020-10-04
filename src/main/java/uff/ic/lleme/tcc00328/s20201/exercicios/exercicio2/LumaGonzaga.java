package uff.ic.lleme.tcc00328.s20201.exercicios.exercicio2;

import java.util.Scanner;

public class LumaGonzaga {

    public static void main(String[] args) {
        int n, count, fat = 1;
      
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o múmero que deseja saber o fatorial: ");
        n = in.nextInt();
        count = n;
        do {
            fat *= count;
            count--;
        } while (count >= 1);
        System.out.println("O fatorial de " + n + " é " + fat);
    }
}
