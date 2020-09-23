/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uff.ic.lleme.tcc00328_classroom.s20201.exercicios.exercicio15;

/**
 *
 * @author GuiTomaz
 */
public class GuilhermeTomazRA {
    public static void main(String[] args){
        float[] categorias = {0.6f, 1f, 2.5f, 3.5f, 4.5f};
        float[] numeros = {2.3f, 2.5f, 2.6f, 10f};

        /*
            CASOS DE TESTE
             float[] categorias = {2.3f, 3.5f, 4.5f};
            float[] numeros = {3.7f, 3f, 7f};
        
            float[] categorias = {1f, 3f, 6f, 8.3f};
            float[] numeros = {2.3f, 4.5f, 6.7f};
        
        */
        float[] percent = histograma(numeros, categorias);
        exibeCategorias(categorias);
        for(int i =0;i<percent.length-1;i++){
            System.out.println("Categoria ["+(i+1)+"] = " + percent[i] + "% dos numeros estão nesta categoria");
        }
        System.out.println("Sem categoria: " + percent[percent.length-1] + "% dos numeros estão sem categoria");
    }
    public static void exibeCategorias(float[] categs){
        System.out.println("---------------------------------------------------");
        System.out.println(" C A T E G O R I A S");
        float ini = categs[0];
        float fim;
        for(int i = 1;i<categs.length;i++){
            fim = categs[i];
            System.out.println("Categoria " + i+ " é: " + ini + " até " + fim);
            ini = fim;
        }
        System.out.println("--------------------------------------------------------");
    }
    public static int categoria(float numero, float[] categs){
        float ini = categs[0];
        float fim;
        int categoria = 1;
        for(int i = 1; i<categs.length;i++){
            fim = categs[i];
            if(numero>=ini && numero<=fim){
                return categoria;
            }
            categoria++;
            ini = fim;
        }
        return -1;//caso o numero nao esteja em nenhuma categoria
    }
    
    public static float[] histograma(float[] numeros, float[] categorias){
        int semCategoria = 0;
        int tipoCategoria[] = new int[categorias.length]; //Vetor que armazena a quantidade de numeros presentes em uma categoria
        //qtdCategoria[0] = categoria 1, qtdCategoria[1] = categoria 2 e assim sucessivamente
        for(int c = 0;c<tipoCategoria.length;c++){
            //Inicializando esse vetor
            tipoCategoria[c] = 0;
        }
        int cat;
        for(int i =0;i<numeros.length;i++){
            cat = categoria(numeros[i], categorias);
            if(cat!= -1){
                tipoCategoria[cat-1]++;//
            }else{
                tipoCategoria[categorias.length-1]++;
            }
       }
       float percentual[] = new float[categorias.length];
       for(int k = 0;k<percentual.length;k++){
           percentual[k] = tipoCategoria[k]/(numeros.length*1.0f) * 100;
       }
       
       return percentual;
    }
}
