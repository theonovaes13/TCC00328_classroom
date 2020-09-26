package uff.ic.lleme.tcc00328_classroom.s20201.exercicios.exercicio15;

public class GabrielaPinheiro {
    
    public static float[] histograma(float[] numeros, float[] categorias){
        float qtdCategorias[];
        qtdCategorias = new float[categorias.length - 1];
        float porcentagens[];
        porcentagens = new float[categorias.length - 1];
        for (int i = 0; i < numeros.length ; i++){
            if(categoria(numeros[i],categorias) != - 1){
                qtdCategorias[categoria(numeros[i],categorias)] = qtdCategorias[categoria(numeros[i],categorias)] + 1;
            }
        }
        for (int i = 0; i < qtdCategorias.length; i++ ){
            float num = qtdCategorias[i]/numeros.length;
            porcentagens[i] = num;
        }
        
        return porcentagens;
        
        
    }
    public static int categoria(float numero, float[] categs){
        for(int i = 0;i<categs.length - 2; i++){
            if (numero >= categs[i] && numero < categs[i+1]){
                return i;
            } 
        }
        if (numero >= categs[categs.length - 2] && numero <= categs[categs.length - 1]){
                return categs.length - 2;
            } 
        return -1;
    }

    public static void main(String[] args) {
        float resultados[];
        
        
        float numeros[] = {1,1.5f,3.2f,4.1f};
        float  categorias[] = {1,2,3,4,5};
        resultados = histograma(numeros,categorias);
        for (int i = 0; i < resultados.length;i++){
           System.out.println(resultados[i]);
        }
        System.out.println("-*-");
        
        
    }
    
}
