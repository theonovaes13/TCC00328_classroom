
package uff.ic.lleme.tcc00328_classroom.s20201.exercicios.exercicio4;
import java.util.Scanner;


public class GabrielaPinheiro {
    public static void primo(int n){
        int divisores = 0;
        int teste = 1;
        do{
            if (n % teste == 0){
                divisores ++;
            }
            teste ++;
        }while(teste <= n);
        
        if (divisores == 2){
            System.out.println("É primo!");
        }else{
            System.out.println("Não é primo!");
        }
    }

    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o número que deseja saber se é primo:");
        n = in.nextInt();
        primo(n);
    }
    
}