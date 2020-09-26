package uff.ic.lleme.tcc00328_classroom.s20201.exercicios.exercicio12;
import java.util.Scanner;

public class GabrielaPinheiro {
    
        public static void divisores(int n) {
            
        System.out.println("Os divisores de "+ n +"são:");
        for (int i = 1;i <= n ; i++){
            if(n%i == 0){
                System.out.println(i);
            }
        }
        
    }
    

    public static void main(String[] args) {
        
        divisores(1);
        divisores(12);
        divisores(7);
    }
    
}