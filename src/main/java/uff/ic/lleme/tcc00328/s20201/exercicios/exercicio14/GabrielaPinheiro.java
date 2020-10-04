
package uff.ic.lleme.tcc00328.s20201.exercicios.exercicio14;

public class GabrielaPinheiro {

    public static float determinante(float[][] A){
        float soma = 0.00f;
        float sub [][];
        for (int j = 0; j < A[0].length;j++){
            //System.out.println(A[0][j]);
            sub = submatriz(A,0,j);
            if (sub[0].length == 2){
                soma += Math.pow(-1,j)*(sub[0][0]*sub[1][1] - sub[0][1]*sub[1][0])*A[0][j]; 
                
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
        sub = new float[A.length-1][A.length-1];
        for(int x = 0; x < A.length - 1 ; x ++){
            for (int y = 0; y < A[x].length - 1; y++){
                if(x < i){
                    if(y < j){
                        //sub[x][y] = A[x][y];
                        System.out.println(A[x][y]);
                    }else{
                        sub[x][y] = A[x][y+1];
                        //System.out.println(A[x][y+1]);
                    }
                }else{
                    if(y<j){
                        sub[x][y] = A[x+1][y];
                         //System.out.println(A[x+1][y]);
                    }else{
                        sub[x][y] = A[x+1][y+1];
                       // System.out.println(A[x+1][y+1]);
                    }
                }
                //System.out.println(sub[x][y]);
            }
        }
        return sub;
    }
    
    public static void main(String[] args) {
        float A[][];
        A = new float[3][3];
        for(int i = 0; i < 3; i++){
           for(int j = 0; j < 3; j++){
               A[i][j] = i+1;
            } 
        }
        System.out.println("O determinante de A é: " + determinante(A));

        A = new float[3][3];
        A[0][0] = 3; A[0][1] = 7; A[0][2] = 9;
        A[1][0] = 4; A[1][1] = 3; A[1][2] = 8;
        A[2][0] = 1; A[2][1] = 8; A[2][2] = 2;
        
        System.out.println("O determinante de A é: " + determinante(A));

           
        
        A = new float[4][4];
        for(int i = 0; i < A.length; i++){
           for(int j = 0; j < A.length; j++){
               A[i][j] = i+j;
            } 
        }
        System.out.println("O determinante de A é: " + determinante(A));

        } 
    
    
   
    }
    

  