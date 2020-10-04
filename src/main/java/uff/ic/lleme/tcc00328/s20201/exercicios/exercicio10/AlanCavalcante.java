/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uff.ic.lleme.tcc00328.s20201.exercicios.exercicio10;

/**
 *
 * @author alanl
 */
public class AlanCavalcante {
    public static void main(String[] args){
        int quantidade=1;
        serie(quantidade);
        quantidade=2;
        serie(quantidade);
        quantidade=5;
        serie(quantidade);
        quantidade=10;
        serie(quantidade);
      
    }
    public static void serie(int quantidade){
        double res=0;
        for(int i=0; i<quantidade; i++){
             res += (Math.pow(-1,i) / (2 * i + 1));
        }
        res*=4;
        System.out.println("Repetido "+quantidade+"° vezes o resultado do somatorio foi " + res);
        System.out.println("---------------------------------------------------------");
    }   
}
