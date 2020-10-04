package uff.ic.lleme.tcc00328.s20201.exercicios.exercicio4;
import java.util.Scanner;

public class GyselleMello {
    public static void main(String[] args) {
        int n, div, primo;
	
        div = 2;
        primo = 1;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o número: ");
        n = entrada.nextInt();

        if (n <= 1)
            primo = 0;

        while (primo == 1 && div <= n / 2) {
            if (n % div  == 0)
                primo = 0;
            div += 1;
        }

        if (primo == 1)
            System.out.println(n + " é primo");
        else
            System.out.println(n + " não é primo");
    }
}
