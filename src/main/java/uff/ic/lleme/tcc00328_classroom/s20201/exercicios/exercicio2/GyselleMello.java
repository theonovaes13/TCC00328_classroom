package uff.ic.lleme.tcc00328_classroom.s20201.exercicios.exercicio2;
import java.util.Scanner;

public class GyselleMello {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num, fat = 1;
        int cont = 1;

        do{
            System.out.println("Digite um número:");
            num = entrada.nextInt();
            
            for(int i=1;i<=num;i++){
                fat = fat * i;
            }
            
            System.out.println("Fatorial de " + num + " = " + fat);
            cont++;
            
       }while(cont < 2);
    }
}
