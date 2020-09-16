package uff.ic.lleme.tcc00328_classroom.s20201.exercicios.exercicio4;
import java.util.Scanner;

public class RenanCabritaValladao {
    public static int n;
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Digite um número inteiro:");
        n = in.nextInt();
        if(primo(n)){
            System.out.println("É primo.");
        }
        else{
            System.out.println("Não é primo.");
        }
    }
    
    public static boolean primo(int n){
        int i = 2;
        if (n==0||n==1){
            return false;
        }
        while (i<=n/2){
            if(n%i==0){
                return false;
            }
            i++;
        }
        return true;
    }
}
