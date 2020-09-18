/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uff.ic.lleme.tcc00328_classroom.s20201.exercicios.exercicio11;

/**
 *
 * @author fabio
 */
public class ProdutoDePrimos {
    
        public static void main(String[] args) {
            
        int tam = 50;
        int vet[] = new int[tam];
        for (int i=1;i<tam;i++) vet[i]=i;
        int num;
        int tam_vet = 0;
        
    /* Descobre a quantidade de numeros primos entre 1 e 50*/  
        for(int i=0;i<tam;i++){
            num=vet[i];
            int divisor = 2;
            int cont = 0;
            while(divisor<num){
                if (num%divisor==0){
                    cont++;
                }
                divisor++;
            }
            if((cont==0)&&(num!=0)&&(num!=1)){
                tam_vet++;
            }
        }
        
    /*Povoa um array dos numeros primos entre 1 e 50*/    
        int vet_primos[] = new int[tam_vet];
        for(int i=0;i<tam_vet;i++) vet_primos[i]=0;
        
        int pos=0;
        for(int j=0;j<tam;j++){
            num=vet[j];
            int divisor = 2;
            int cont = 0;
            while(divisor<num){
                if (num%divisor==0){
                    cont++;
                }
                divisor++;
            }
            if((cont==0)&&(num!=0)&&(num!=1)){
                vet_primos[pos]=num;
                pos++;
            }
        }    
        
        int acumulador=1;
        for(int i=0;i<tam_vet;i++){
            
            acumulador = acumulador*vet_primos[i];
            System.out.printf("%d \n",acumulador);
            
        }
        
    }
}
