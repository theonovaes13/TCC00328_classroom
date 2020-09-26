package uff.ic.lleme.tcc00328_classroom.s20201.exercicios.exercicio14;

public class RenanCabritaValladao {
    public static void main(String[] args){
        int n = 4;
        float A[][] = {{1, 2, 3, 4},{4, 3, 2, 1},{5, 6, 7, 8}, {8, 7, 6, 5}};
        System.out.println("Determinante = " + determinante(A, n));
    }
    
    public static float determinante(float[][] A, int n){
        if(n==1){
            return A[0][0];
        }
        else{
            int i = 0;
            float det = 0;
            for(int j = 0; j < n; j++){
                det += (A[i][j] * (float)Math.pow(-1, i+j) * determinante(submatriz(A, i, j, n), n-1));
            }
            return det;
        }
    }
    
    public static float[][] submatriz(float [][] A, int i, int j, int n){
        float aux[][] = new float [n-1][n-1];
        int x = 0, y = 0;
        for(int b = 0; b < n; b++){
            for(int c = 0; c < n; c++){
                if(b != i && c != j){
                    aux[x][y] = A[b][c];
                    y++;
                }
            }
            if(y != 0){
                x++;
                y = 0;
            }
        }
        return aux;
    }
}
