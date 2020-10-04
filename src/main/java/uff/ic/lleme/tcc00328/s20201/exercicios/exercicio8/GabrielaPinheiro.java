package uff.ic.lleme.tcc00328.s20201.exercicios.exercicio8;
import java.util.Scanner;


public class GabrielaPinheiro {
    public static void primo(int n){
        int divisores = 0;
        for (int teste = 1;teste <= n;teste++){
            if (n % teste == 0){
                divisores ++;
            }
        }
        
        if (divisores == 2){
            System.out.println(n +" É primo!");
        }else{
            System.out.println(n + " Não é primo!");
        }
    }

    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        n = 1;
        primo(n);
        
        n = 4;
        primo(n);
        
        n = 7;
        primo(n);
    }
    
}