/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uff.ic.lleme.tcc00328.s20201.exercicios.exercicio11;

/**
 *
 * @author alanl
 */
public class AlanCavalcante {
    public static void main(String[] args){
        int n1=2, n2=1, cont=0, tot=0,res=1;
        System.out.println("Os primeiros 50 primos são: ");
        while(tot!=50){
            while(n2<=n1 && cont < 3 ){
                if (n1%n2==0){
                    cont++;
                }
                n2++;
            }
            if(cont==2){
                tot++;
                res*=(n2-1);
                System.out.println("A posicao: "+tot+"° pertence ao elemento "+ (n2-1));
            }
            cont=0;
            n2=1;
            n1++;
        }
        System.out.println("A sua multiplicacao é "+res);
        
    }
    
}
