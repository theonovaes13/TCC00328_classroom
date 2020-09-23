package uff.ic.lleme.tcc00328_classroom.s20201.exercicios.exercicio8;
import java.util.Scanner;

public class IgorGomesVieira {
    public static int numero;
    public static int resultado;
    public static void main(String[] args){
       Scanner in = new Scanner(System.in);
       System.out.println("Digite um numero inteiro para verificar se é primo: ");
       numero = in.nextInt();
       resultado = ehPrimo(numero);
       if(resultado == 1){
           System.out.println("É um numero primo");
       }else{
           System.out.println("Não é um numero primo");
       }
       
       
       
    }
    
    public static int ehPrimo(int numero){
        int i = 1;
        int divisões = 0;
        for (i=1;i!=numero;i++)
        {
            if(numero%i == 0){
                divisões ++;
            }
        }
        if(divisões == 1){
                return 1;
            }else{
                return 0;
            }
        
    }
}
