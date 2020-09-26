
package uff.ic.lleme.tcc00328_classroom.s20201.exercicios.exercicio14;

public class GabrielaPinheiro {

    public static float determinante(float[][] A){
        float soma = 0.00f;
        float sub [][];
        for (int j = 0; j < A[0].length;j++){
            sub = submatriz(A,0,j);
            if (sub[0].length == 2){
                soma += sub[0][0]*sub[1][1] - sub[0][1]*sub[1][0]; 
            }else if(sub[0].length < 2){
                return -999999999;
            }
            else{
                soma += determinante(sub);
            }
        }
        return soma;
    }
    public static float[][] submatriz(float[][] A, int i, int j){
        float sub[][];
        sub = new float[A.length][];
        for(int x = 0; x < A.length - 1 ; x ++){
            for (int y = 0; y < A[x].length - 1; x++){
                if(x < i){
                    if(y < j){
                        sub[x][y] = A[x][y];
                    }else{
                        sub[x][y] = A[x][y+1];
                    }
                }else{
                    if(y<j){
                        sub[x][y] = A[x+1][y];
                    }else{
                        sub[x][y] = A[x+1][y+1];
                    }
                }
            }
        }
        return sub;
    }
    
    public static void main(String[] args) {
        float A[][];
        A = new float[3][3];
        for(int i = 0; i < 3; i++){
           for(int j = 0; j < 3; j++){
               A[i][j] = i+j;
            } 
        }
        System.out.println(determinante(A));

    }
    
}
