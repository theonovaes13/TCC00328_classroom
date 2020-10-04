package uff.ic.lleme.tcc00328.s20201.exercicios.exercicio15;

public class RenanCabritaValladao {
    public static void main(String[] args){
        float n = 4.2f;
        int cat;
        float[] numeros = {2,2.5f,3,4,5};
        float[] categorias = {2.3f, 3.5f, 4.7f};
        float[] perc;
        
        cat = categoria(n, categorias);
        if(cat != -1){
            System.out.println("O número " +n+ " está entre " +categorias[cat]+ " e " + categorias[cat + 1]);
        }
        else{
            System.out.println("O número " +n+ " não se encontra em nenhuma categoria");
        }
        
        perc = histograma(numeros, categorias);
        System.out.println("Porcentagem dos números nas categorias:");
        for(int i = 0; i<perc.length; i++){
            System.out.println("Entre "+categorias[i]+" e "+categorias[i+1]+":"+(100*(perc[i]/numeros.length))+"%");
        }
    }
    
    public static float[] histograma(float[] numeros, float[] categorias){
        float[] aux = new float[categorias.length-1];
        int cat;
        for(int i = 0; i < numeros.length; i++){
            cat = categoria(numeros[i], categorias);
            if(cat != -1){
                aux[cat]++;
            }
        }
        return aux;
    }
    
    public static int categoria(float numero, float[] categs){
        for(int i = 0; i < categs.length-1; i++){
            if(numero > categs[i] && numero < categs[i+1]) return i;
        }
        return -1;
    }
}
