package uff.ic.lleme.tcc00328_classroom.s20201.exercicios.exercicio9;
import java.util.Scanner;

public class GabrielaPinheiro {
    public static int fibonacci(int n){
        int n1 = 0;
        int n2 = 1;
        int aux;
        if(n <= 2){
            return n-1;
        }else{
        for (int i = 2; i <= n; i++){
            aux = n1 + n2;
            n1 = n2;
            n2 = aux;
            
        }
        return n1;
        }
    }
        
        

    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        
        n = 2;
        System.out.println("O número da posição "+ n +" é: ");
        System.out.println(fibonacci(n));
        
        n = 4;
        System.out.println("O número da posição "+ n +" é: ");
        System.out.println(fibonacci(n));
        
        n = 5;
        System.out.println("O número da posição "+ n +" é: ");
        System.out.println(fibonacci(n));
    }
    
}
