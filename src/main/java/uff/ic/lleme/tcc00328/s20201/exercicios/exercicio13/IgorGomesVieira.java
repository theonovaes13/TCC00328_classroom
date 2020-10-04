
package uff.ic.lleme.tcc00328.s20201.exercicios.exercicio13;

import java.util.Scanner;

public class IgorGomesVieira {
    public static int numero;
    public static double soma;
    public static double media;
    

    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite a quantidade de numeros: ");
        numero = in.nextInt();
        soma =0;
        int i=0;
        int vetor[] = new int[numero];
        for(i=0;i<numero;i++){
            System.out.println("Digite o valor do numero da posição "+ i +": ");
            vetor[i] = in.nextInt(); 
            soma += (double)vetor[i];
            System.out.println(vetor[i]);
        }
        media = soma / (double)numero;
        System.out.println("A media desse numeros equivale há: " +media);
        
    }
}
