package uff.ic.lleme.tcc00328_classroom.s20201.exercicios.exercicio11;
import java.util.Scanner;

public class IgorGomesVieira {
    public static int numero;
    public static long resultado;
    public static void main(String[] args){
       resultado = resultado();
       System.out.println("Resultado da soma dos 50 primeiros primos: " + resultado);

       
       
    }
    
    public static boolean ehPrimo(int numero){
        int i = 1;
        int divisões = 0;
        while(i!=numero){
            
            if(numero%i == 0){
                divisões ++;
            }
            i ++;
        }
        if(divisões == 1){
                return true;
            }else{
                return false;
            }
        
    }
    public static long resultado(){
        long resultado = 1;
        for(int i=1; i<51; i++){
            if(ehPrimo(i)){
                resultado = resultado *  i;
            }
        }
        return resultado;
    }
}
