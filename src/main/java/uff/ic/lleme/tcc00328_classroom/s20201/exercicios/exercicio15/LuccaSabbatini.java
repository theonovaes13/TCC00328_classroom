/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uff.ic.lleme.tcc00328_classroom.s20201.exercicios.exercicio15;
import java.util.Arrays;

/**
 *
 * @author lucca
 */
public class LuccaSabbatini {
    public static void main(String[] args) {
        float numeros[] = {1.3f, 1.7f, 2.5f, 2.7f, 3.2f ,3.3f, 4.3f, 4.7f, 5.8f, 7.9f};
        float categs[] = {2.3f, 3.5f, 4.7f};

        System.out.println("Números:");
        System.out.print(Arrays.toString(numeros));
        System.out.println("Categorias:");
        System.out.println(Arrays.toString(categs));
        System.out.println("Histograma:");
        System.out.println(Arrays.toString(histograma(numeros, categs)));
        System.out.println("OBS: Posição de índice 0 no histograma representa "
                + "números fora de qualquer categoria");
    }
    
    public static int categoria(float numero, float[] categs) {
        int categ = -1;
        
        for (int i = 0; i < categs.length - 1; i++) {
            if (numero >= categs[i] && numero <= categs[i + 1]) {
                categ = i + 1;
            }
        }
        
        return categ;
    }
    
    public static float[] histograma(float[] numeros, float[] categorias) {
        float histograma[];
        histograma = new float [categorias.length];
        int outsideCategs = 0;
        
        for (int i = 1; i < histograma.length; i++) {
            int res = 0;
            
            for (int j = 0; j < numeros.length; j++) {
                if (categoria(numeros[i], categorias) == i) {
                    res++;
                }
            }
            
            histograma[i] = res / numeros.length;
        }
        
        for (int i = 0; i < numeros.length; i++) {
            if (categoria(numeros[i], categorias) == -1) {
                outsideCategs++;
            }
        }
        
        histograma[0] = outsideCategs / numeros.length;
        
        return histograma;
    }
}
