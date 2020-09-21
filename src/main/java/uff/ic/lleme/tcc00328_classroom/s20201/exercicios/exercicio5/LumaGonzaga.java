package uff.ic.lleme.tcc00328_classroom.s20201.exercicios.exercicio5;

import java.util.Scanner;

public class LumaGonzaga {

    public static void main(String[] args) {
        int n, soma, x = 0, y = 1, l = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite a posição que deseja saber: ");
        n = in.nextInt();
        int aux = n - 1;
        if (n < 0) {
            System.out.println("A posição precisa ser um número maior ou igual a zero.");
            System.exit(0);
        }
        if (n == 0 || n == 1) {
            soma = n;
            System.out.println("O número da sequência Fibonatti na posição " + n + " é " + soma);
            System.exit(0);
        }
        do {
            soma = x + y;
            x = y;
            y = soma;
            l++;
        } while (l != aux);
        System.out.println("O número da sequência Fibonatti na posição " + n + " é " + soma);
    }

}
