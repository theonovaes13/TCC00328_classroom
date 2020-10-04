/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uff.ic.lleme.tcc00328.s20201.exercicios.exercicio8;
/**
 *
 * @author alanl
 */
public class AlanCavalcante {
    public static void main(String[] args){
        
        int n1=1;
        primo(n1);
        n1=2;
        primo(n1);
        n1=5;
        primo(n1);
        n1=10;
        primo(n1);
        n1=97;
        primo(n1);
    }
    
    public static void primo(int n1){
        int cont = 0;
        
        for(int n2=1; n2<=n1; n2++){
            if (n1%n2==0){
                cont++;
            }
        }
        if (cont == 2){
            System.out.println("O numero "+n1+" é primo");
        }else{
            System.out.println("O numero "+n1+" não é primo");
        }
    }
}
