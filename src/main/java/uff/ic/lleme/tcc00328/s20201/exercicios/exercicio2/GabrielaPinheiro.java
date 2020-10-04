package uff.ic.lleme.tcc00328.s20201.exercicios.exercicio2;
import java.util.Scanner;


public class GabrielaPinheiro {
    public static void main(String[] args){
        int n, fat;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        n = in.nextInt();
        fat = 1;
        if (n > 0 ){
            do{
                fat *= n;
                n --;
            
            } while (n > 1);
        }
        System.out.println("O fatorial deste número é: ");
        System.out.println(fat);
    }
}
