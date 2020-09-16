/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeroprimo;
import java.util.Scanner;
/**
 *
 * @author theo
 */
public class NumeroPrimo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean primo = true;
        Scanner myObj = new Scanner(System.in);
        System.out.println("Insira o numero a ser testado:\n");
        int numero = myObj.nextInt();
        int numOriginal = numero;
        int lixo = 2;
        do{
            if(numero % lixo == 0 && numOriginal != 2) {
                primo = false;
            }
            lixo += 1;
        }
        while(lixo < numero);
        if (primo) {
            System.out.printf("o numero é primo.\n");
        }else{
            System.out.printf("o numero não é primo.\n");
        }
        
        
    }
    
}
