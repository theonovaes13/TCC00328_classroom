package uff.ic.lleme.tcc00328.s20201.exercicios.exercicio16;

public class RenanCabritaValladao {
    public static void main(String[] args){
        int n = 5;
        int tab[][] ={
            {10, 8, 3, -4, 12},
            {19, 8, 7, 13, 29},
            {10, 8, 3, -5, 11},
            {11, 8, 3, -1, 15},
            {19, 8, 7, 13, 26},
        }; 
        System.out.println("Líder: Time " + lider(n, tab));
    }
    
    public static int lider(int n, int[][] tab){
        int maior = tab[0][0];
        int lider = 0;
        for(int i = 1; i < n; i++){
            if(tab[i][0] > maior){
                maior = tab[i][0];
                lider = i;
            }
            else if(tab[i][0] == maior){
                for(int j = 2; j < 5; j++){
                    if(tab[i][j] > tab[lider][j]){
                        lider = i;
                        break;
                    }
                    else if(tab[i][j] < tab[lider][j]){
                        break;
                    }
                }
            }
            System.out.println(lider);
        }
        return lider;
    }
}
