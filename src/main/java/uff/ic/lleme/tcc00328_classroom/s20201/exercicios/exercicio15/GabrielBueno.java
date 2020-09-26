/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uff.ic.lleme.tcc00328_classroom.s20201.exercicios.exercicio15;

/**
 *
 * @author Bueno
 */
public class GabrielBueno {
    
    public static void main(String args[]){
        float category[] = {2.3f, 3.5f, 4.7f, 5.4f};
        float numbers[] = {2.3f, 2.5f, 2.6f, 2.7f, 2.8f, 3.5f, 4.7f, 3.5f, 3.6f, 2.9f};
        
        float result[] = histograma(numbers, category);
        int i;
        
        for(i = 0; i < result.length; i++){
            System.out.printf("%.2f%% na categoria %d \n", result[i],(i+1));
        }
        
    }
    
    public static int categoria(float num, float category[]){
        int i;
        if(num < category[0] || num > category[category.length - 1]){
            return -1;
        }
        
        for(i = 0; i < category.length-1; i++){
             if(num >= category[i] && num < category[i + 1]){
                 return i + 1;
             }
        }
        
        return category.length - 1;

    }
    
    public static float[] histograma(float numbers[], float category[]){
        int i, j;
        float percent[] = new float[category.length - 1];
        
        for(i = 0; i< category.length-1; i++){
            float count = 0f;
            
            for(j = 0; j < numbers.length; j++){
                if(categoria(numbers[j], category) == i+1){
                    count ++;
                }
            }
            
            percent[i] = count/numbers.length * 100;
            
        }
        
        return percent;
    }
}
