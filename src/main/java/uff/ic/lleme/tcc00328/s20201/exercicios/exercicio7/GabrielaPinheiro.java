package uff.ic.lleme.tcc00328.s20201.exercicios.exercicio7;
import java.util.Scanner;

public class GabrielaPinheiro {
    public static int mdc(int n1, int n2){
        for(int resto = n1%n2;resto != 0; resto = n1%n2){
            n1 = n2;
            n2 = resto;
        }
        
        return n2;
    }

    public static void main(String[] args) {
        int n1,n2;
        Scanner in = new Scanner(System.in);
        n1 = 4;
        n2 = 12;
        System.out.println("O mdc de "+ n1 + " e "+ n2 + " é: ");
        System.out.println(mdc(n1,n2));
        
         n1 = 12;
        n2 = 5;
        System.out.println("O mdc de "+ n1 + " e "+ n2 + " é: ");
        System.out.println(mdc(n1,n2));
        
         n1 = 21;
        n2 = 35;
        System.out.println("O mdc de "+ n1 + " e "+ n2 + " é: ");
        System.out.println(mdc(n1,n2));
    }
    
}
