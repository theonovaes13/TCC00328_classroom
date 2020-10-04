package uff.ic.lleme.tcc00328.s20201.exercicios.exercicio13;

import java.util.Scanner;

public class LumaGonzaga {

    public static void main(String[] args) {
        int count = 1, soma = 0, y = 0;
        float media, x, n;
        Scanner tecla = new Scanner(System.in);
        System.out.println("Digite a quantidade de números para a média: ");
        n = tecla.nextFloat();
        do {
            Scanner teclan = new Scanner(System.in);
            System.out.println("Digite um número: ");
            x = teclan.nextFloat();
            soma += x;
            count++;
        } while (count <= n);
        media = (soma / n);
        System.out.println("A média é: " + media);
    }
}
