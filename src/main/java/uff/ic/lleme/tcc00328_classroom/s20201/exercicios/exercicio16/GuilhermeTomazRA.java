/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uff.ic.lleme.tcc00328_classroom.s20201.exercicios.exercicio16;

/**
 *
 * @author User
 */
public class GuilhermeTomazRA {
    public static void main(String[] args){
        int tabela[][] = new int[][] {{10, 8, 3, -4, 12}, {19, 8, 7, 10, 19}, {10, 8, 3, -5, 11}, {11, 8, 3, -1, 15}, {19, 8, 6, 13, 23}}; 
        int times = 5;
        int vencedor = liderCamp(times, tabela);
        System.out.println("Vencedor: "+ vencedor);
    }
    
    public static int liderCamp(int times, int[][] tabela){
        /*
        Tabela:
        Coluna [0] = PG
        Coluna [1] = J
        Coluna [2] = V
        Coluna [3] = SG
        Coluna [4] = GP
        
        Entao:
        tabela[0][0] = Numero de pontos do time 0, info fornecida pela matriz tabela(parametro da funcao)
        
        */
        int lider = 0;
        int aux[] = new int[times]; //Vetor auxiliar para fazer armazenar o time lider
        //Inicializando vetor auxiliar com 0
        for(int t = 0;t<5;t++){
            //T<5 pois são 5 campos, PG, J, V,SG,GP
            aux[t] = 0;
        }
        for(int i = 0;i<times;i++){
           if(tabela[i][0]>aux[0]){
               //Verifica se PG é maior doq o atual lider
               for(int c = 0;c<5;c++){
                   aux[c] = tabela[i][c];
               }
               lider = i;
               
               
           }else if(tabela[i][0]==aux[0]){
               //Verifica se PG é igual ao atual lider, se nao for nem igual nem maior, é menor,entao vai pro proximo time
               int k = 2; //Sera usado como indice para o numero de vitorias 
               while(k<=4){
                   /*
                   Loop para comparar os campos restantes:V,SG,Gp
                   Se em algum desses campos o time for superior ao atual lider, a troca é feita e o novo lider
                   é atualizado e o loop é encerrado.
                   */         
                    
                   if(tabela[i][k]>aux[k]){

                       lider = i;
                       for(int c = 0;c<5;c++){
                            aux[c] = tabela[i][c];
                            
                        }
                       break;
                   }else if(tabela[i][k] == aux[k]){
                       k++;
                   }else{
                       break;
                   }
                   //Vamos para o proximo campo V->SG->GP
               }
            }
        }
        return lider;
    }
}

