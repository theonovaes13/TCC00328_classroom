package uff.ic.lleme.tcc00328.s20201.exercicios.exercicio13;
import java.util.Scanner;

public class GabrielaPinheiro {
    
    public static void main(String[] args) {
        int n,soma = 0 , qtd = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite os números que deseja fazer a média. Quando quiser parar digite qualquer letra ou palavra:");
        while(in.hasNextInt()){
            n = in.nextInt();
            qtd++;
            soma += n;
        }
        
        System.out.println("A média é: ");
        System.out.println(soma/qtd);
    }
    
}
