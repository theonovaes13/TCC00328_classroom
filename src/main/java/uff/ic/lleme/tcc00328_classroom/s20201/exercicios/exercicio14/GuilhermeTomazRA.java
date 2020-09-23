/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uff.ic.lleme.tcc00328_classroom.s20201.exercicios.exercicio14;

/**
 *
 * @author GuiTomaz
 */
public class GuilhermeTomazRA {
    public static void main(String[] args){
        float mat[][] = {
                            {1,2,3},
                            {4,5,6},
                            {7,8,9}
                         };
         float mat2[][] = {
                            {4,5,-3,0},
                            {2,-1,3,1},
                            {1,-3,2, 1},
                            {0, 2, -2, 5}
                         };
         float mat3[][] = {
                            {1, 2, 3, -3, 1},
                            {0, 4, 0, 0, 0},
                            {0, 1, 0, 1, 1},
                            {0, -6, 6, 1, 3},
                            {0, 2, 0, -1, 1}
         };
         float mat4[][] = {
                            {1, 0, 5, 0},
                            {2, -1, 0, 3},
                            {3, 0, 2, 0},
                            {7, 0, 6, 5}
                         };
        float D = determinante(mat); 
        float D2 = determinante(mat2);
        float D3 = determinante(mat3);
        float D4 = determinante(mat4);
        System.out.println("D1 = " + D);
        System.out.println("D2 = " + D2);
        System.out.println("D3 = " + D3);
        System.out.println("D4 = " + D4);
     }
    public static float determinante(float [][] A){
        float D = 0f;
        int j = 1; //Escolhemos a primeira coluna
        if(A.length == 2){
            D = (A[0][0]* A[1][1]) - (A[1][0]*A[0][1]);
            
        }else{
            for (int i = 0; i< A.length;i++){ //Vamos variar entre as linhas
                /*
                Ex:Matriz 3x3, sendo A=cofatorij
                
                a01*A01 + a11*A11 + ... + a21*A21

                */
                //
                D = (float) (D + A[i][j]* Math.pow(-1, i+j) * determinante(submatriz(A, i, j)));
                
            }   
        }
        System.out.println("Determinante D = "+ D);
        System.out.println("----------------------------------------------");
        return D;
    }
    public static float[][] submatriz(float [][] A, int i, int j){
        float M[][] = new float[A.length-1][A.length-1];
        float aux[] = new float[M.length * M.length];
        int auxTam = 0;  
        /*
            Coloca os valores de linhas e colunas permitidas em um vetor auxiliar em ordem.
        Ex:Desde o item a00 até o ultimo elemento da matriz, excluindo-se os elementos nao permitidos
            Os valores deste vetor serão colocados posteriormente na submatriz.
        */
        for(int l = 0;l<A.length;l++){
                for(int c=0;c<A.length;c++){
                    if(l == i){
                        break;
                    }else{
                        if(c == j){
                            continue;
                        }else{     
                            aux[auxTam] = A[l][c];
                            auxTam++;
                        }
                    }         
                }
               
        }
        int indAux = 0;
        for(int l = 0;l<M.length;l++){
            for(int c = 0;c<M[0].length;c++){
                M[l][c] = aux[indAux];
                indAux++;
            }
        }
        return M;
    }
}
