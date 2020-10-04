/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uff.ic.lleme.tcc00328.s20201.exercicios.exercicio10;
import java.util.Scanner;

/**
 *
 * @author theo
 */
public class TheoNovaesMelloDeOliveira {
    public static void main(String[] args) {
        int i = 1, n;
        float resultado = 0.0f;
        Scanner myObj = new Scanner(System.in);
        System.out.println("Insira o número de termos para o somatório de aproximação de pi:\n");
        n = myObj.nextInt();
        for(i=1; i <=n; i++){
            if(i%2==0){
                System.out.println(resultado + "-" +(1.0/(2*(i-1) + 1)));
                resultado -= 1.0/(2*(i-1) + 1);
            }else {
                System.out.println(resultado +"+"+ (1.0/(2*(i-1) + 1)));
                resultado += 1.0/(2*(i-1) + 1);
            }
        } 
        System.out.println("O valor aproximado de pi é: " + 4*resultado + ".\n");
    }
    
}
