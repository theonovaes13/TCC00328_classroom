
package uff.ic.lleme.tcc00328.s20201.exercicios.exercicio11;
import java.util.Scanner;



public class GabrielaPinheiro {
    public static int primo(int n){
        int divisores = 0;
        int teste = 1;
        do{
            if (n % teste == 0){
                divisores ++;
            }
            teste ++;
        }while(teste <= n);
        
        if (divisores == 2){
            return n;
        }else{
            return 1;
        }
    }

    public static void main(String[] args) {
        long multiplicacao = 1;
        
        for (int i = 1;i<= 50;i++){
            multiplicacao *= primo(i);
        }
        System.out.println("A multiplicação dos números primos entre 1 e 50 é: ");
        System.out.println(multiplicacao);
    }
    
}
