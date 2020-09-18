
package uff.ic.lleme.tcc00328_classroom.s20201.exercicios.exercicio3;

import java.util.Scanner;


public class IgorGomesVieira {
    public static int numero1;
    public static int numero2;
    public static int resto;
    public static int resposta;
    
    public static void main(String[] args) { 
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        numero1 = in.nextInt();
        
        System.out.println("Digite o segundo numero: ");
        numero2 = in.nextInt();
        
        resposta = calculoMDC(numero1,numero2);
       
        System.out.println("MDC: "+resposta);

    }
    
    public static int calculoMDC(int numero1 , int numero2){
        while(numero2 != 0){
            resto = numero1 % numero2;
            numero1 = numero2;
            numero2 = resto;        
        }
        return numero1;
    }
    
}
