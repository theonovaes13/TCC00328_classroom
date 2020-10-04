/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uff.ic.lleme.tcc00328.s20201.exercicios.exercicio15;

/**
 *
 * @author alanl
 */
public class AlanCavalcante {
    
    public static void main(String[] args){
        float[] categorias = {0.1f, 1f, 3f, 5f};
        float[] numeros = {0, 1.2f, 2.2f, 3.5f, 5, 3};
        for(float f :histograma(numeros, categorias)){
            System.out.println(f);
        }
    }
    
    public static int categoria(float num, float[] categorias){
        
        for (int i=1; i< categorias.length ; i++){
            if (num >= categorias[i-1] && num < categorias[i]) return i-1;
        }
        return -1;
    }
    
    public static float[] histograma(float[] numeros, float[] categorias){
        
        float[] dados = new float[categorias.length-1];
        float percent = (1/(float)numeros.length)*100;
        for (int i = 0; i < numeros.length; i++) {
          int index = categoria(numeros[i], categorias);
          if (index==-1) continue;
          dados[index] += percent;
        }
       return dados;
    }
}
