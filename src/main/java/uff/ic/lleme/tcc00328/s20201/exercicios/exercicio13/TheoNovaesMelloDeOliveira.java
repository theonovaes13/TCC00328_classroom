/*
 * Programa pra calcular a média entre N números;
 */
package uff.ic.lleme.tcc00328.s20201.exercicios.exercicio13;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
 

/**
 *
 * @author theo
 */
public class TheoNovaesMelloDeOliveira {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int contadorMedia = 0, numeroInserido, soma = 0;
        float resultado;
        System.out.println("Por favor, insira os números para que seja calculada a média entre eles");
        System.out.println("Insira o valor 9999 para finalizar.\n");
        do {
                    System.out.println("Insira um valor:");
                    numeroInserido = myObj.nextInt();
                    if(numeroInserido == 9999){
                        break;
                    }else{
                        soma += numeroInserido;
                        contadorMedia += 1;
                    }
        }while(true);
        resultado = soma/contadorMedia;
        System.out.println("Inserção de valores finalizada\n");
        System.out.println("A média dos números é: "+ resultado);
        
    }
}
