

package uff.ic.lleme.tcc00328_classroom.s20201.exercicios.exercicio3;
import java.util.Scanner;

public class GabrielaPinheiro {
    public static int mdc(int n1, int n2){
        int resto;
        do{
            resto = n1%n2;
            n1 = n2;
            n2 = resto;
        }while(resto != 0);
        
        return n1;
    }

    public static void main(String[] args) {
        int n1,n2;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite os números que deseja fazer o mdc:");
        n1 = in.nextInt();
        n2 = in.nextInt();
        System.out.println("O mdc é: ");
        System.out.println(mdc(n1,n2));
    }
    
}
