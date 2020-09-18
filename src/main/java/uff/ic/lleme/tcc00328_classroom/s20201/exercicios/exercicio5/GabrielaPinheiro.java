package uff.ic.lleme.tcc00328_classroom.s20201.exercicios.exercicio5;
import java.util.Scanner;

public class GabrielaPinheiro {
    public static int fibonacci(int n){
        int n1 = 0;
        int n2 = 1;
        int aux, i=2;
        if(n <= 2){
            return n-1;
        }else{
        do{
            aux = n1 + n2;
            n1 = n2;
            n2 = aux;
            i++;
        }while(i <= n);
        
        return n1;
        }
    }
        
        

    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite a posição que deseja conhecer da sequência de fibonacci: ");
        n = in.nextInt();
        System.out.println("O número nessa posição é: ");
        System.out.println(fibonacci(n));
    }
    
}
