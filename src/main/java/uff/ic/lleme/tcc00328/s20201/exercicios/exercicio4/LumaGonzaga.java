package uff.ic.lleme.tcc00328.s20201.exercicios.exercicio4;

import java.util.Scanner;

public class LumaGonzaga {
    public static void main(String[]args){
            Scanner tecla = new Scanner(System.in);
            int n, count = 1, div = 0;
               System.out.println("Digite um número inteiro: ");
                n = tecla.nextInt();
        if(n <= 1){
            System.out.println(n + " Não é número primo");
            System.exit(0);
        }else{
            
            do{
                if(n % count == 0){
                    div++;
                    count++;
                }else{
                count++;
                }
            }while(count != n) ;
            
            if(2<=div){
                System.out.println(n + " Não é número primo");
            }else{
                System.out.println(n + " É número primo");
            }
        }
    }
}
