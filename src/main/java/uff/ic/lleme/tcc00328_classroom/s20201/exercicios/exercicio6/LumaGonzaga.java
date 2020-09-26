package uff.ic.lleme.tcc00328_classroom.s20201.exercicios.exercicio6;

import java.util.Scanner;

public class LumaGonzaga {

    public static void main(String[] args) {
        int n, count = 0, i = 0, mult;
        double exp, div, result, soma=0;

        Scanner tecla = new Scanner(System.in);
        System.out.println("Digite a quantidade de resultados do somatório: ");
        n = tecla.nextInt();
        if (n == 0 || n == 1 ) {
        System.out.println("erro ");
        System.exit(0);
        }
        do {
            exp = Math.pow((-1), i);
            mult = (2 * i) + 1;
            div = exp / mult;
            result = div * 4;
            soma = soma + result;
            count++;
            i++;

        } while (count != n);
        System.out.println(" O resultado do somatório na posição " + n + " é " + soma);

    }
}
