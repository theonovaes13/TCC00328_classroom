package uff.ic.lleme.tcc00328.s20201.exercicios.exercicio8;
import java.util.Scanner;

public class GyselleMello {
    public static void main(String[] args) {
        int n, i, div;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o número: ");
        n = entrada.nextInt();
        
        div = 0;        
        for(i=1;i!=n;i++){
            if(n%i == 0){
                div++;
            }
        }
        if (div == 1)
            System.out.println(n + " é primo");
        else
            System.out.println(n + " não é primo");
    }
}
