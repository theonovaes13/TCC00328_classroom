
package uff.ic.lleme.tcc00328_classroom.s20201.exercicios.exercicio9;

import java.util.Scanner;


public class IgorGomesVieira {
    public static int numero;
    
    public static int resultado;
    public static void main(String[] args){
       Scanner in = new Scanner(System.in);
       System.out.println("Digite uma posição: ");
       numero = in.nextInt();
       resultado = fibonacci(numero);
        System.out.println("O numero dessa posição na sequencia de fibonacci é: "+resultado);
       }
    
    public static int fibonacci(int numero){
        int soma = 0;
        int i = 1;
        int num1 = 0;
        int num2 = 1;
        for(i=1;i<=numero;i++)
        {
            soma = num1 + num2;
            num1 = num2;
            num2 = soma;
        }
        return num1;
    }
}
