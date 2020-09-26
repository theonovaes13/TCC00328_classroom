package uff.ic.lleme.tcc00328_classroom.s20201.exercicios.exercicio12;

import java.util.Scanner;

public class LumaGonzaga {

    public static void main(String[] args) {
        float n, i = 0;
        Scanner tecla = new Scanner(System.in);
        System.out.println("Digite um número maior que 0: ");
        n = tecla.nextFloat();
        System.out.println("Os divisores de " + n +" são: ");
        do {
            if (n % i == 0) {
                System.out.println(+i);
            }
            i++;
        } while (i <= n);

    }
}
