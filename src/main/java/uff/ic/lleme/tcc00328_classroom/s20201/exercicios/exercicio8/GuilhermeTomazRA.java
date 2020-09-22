/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uff.ic.lleme.tcc00328_classroom.s20201.exercicios.exercicio8;

/**
 *
 * @author User
 */
public class GuilhermeTomazRA {
    public static void main(String[] args){
        int n;
        n = 3;
        VerificaPrimo(n); //verifica e imprime se o numero n é primo ou não
        n = 16;
        VerificaPrimo(n);
        n = 29;
        VerificaPrimo(n);
        n = 45;
        VerificaPrimo(n);
        n = 71;
        VerificaPrimo(n);
    }
    
     public static void VerificaPrimo(int numero){
        int aux;
        boolean primo = true;
        for(aux = 2;aux<numero/2;aux++){
            if(numero % aux == 0){
              primo = false;
              break;
          } 
        }
        if(numero == 2 || primo == true){
            //Verifica se 3 eh primo
            System.out.println(" Numero " + numero + " É  primo");
        }else{
            System.out.println(numero+" NÃO é primo");
        }
    }
}
