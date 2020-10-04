package uff.ic.lleme.tcc00328.s20201.exercicios.exercicio2;
import java.util.Scanner;

public class GyselleMello {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num, fat = 1, i = 1, cont = 1;

        do{
            System.out.println("Digite um número:");
            num = entrada.nextInt();
            
            while(i<=num){
                fat = fat * i;
                i++;
            }
            
            System.out.println("Fatorial de " + num + " = " + fat);
            cont++;
            
       }while(cont < 2);
    }
}
