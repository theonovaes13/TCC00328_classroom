/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uff.ic.lleme.tcc00328_classroom.s20201.exercicios.exercicio16;

import java.util.*;

/**
 *
 * @author fabio
 */
public class FabioSCPaulo {

    public static int lider(int [][]tabela){
        int lider=0; //numero do time lider
        int atual = tabela[0][0]; //busca o maior numero de pontos
        int pos_lider = 0; //busca a posição da linha onde o lider esta na matriz

        for (int i=1;i<tabela.length;i++){
            if(tabela[i][0]>atual) { //se o numero de pontos do time na linha for maior, atualiza a posição do lider
                atual = tabela[i][0];
                lider = i;
                pos_lider = i;
            }else if(tabela[i][0]==atual){ //se o numero de pontos do time na linha for igual, verifica os criterios de desempate
                for (int j=2;j<tabela[i].length;j++){ //inicia na posição 2 para ignorar o numero de jogos e pontos
                    if(tabela[i][j]>tabela[pos_lider][j]){ //verifica qual o time com os melhores criterios de desempate, ao achar, atualiza a posição do lider
                        atual = tabela[i][0];
                        lider = i;
                        pos_lider = i;
                    }
                }
            }
        }
        return pos_lider;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.printf("Digite 1 para executar o caso teste, 2 para iniciar o campeonato com outros resultados: ");
        int test = in.nextInt();
        int [][] tabela2 = new int [][] {{10,8,3,-4,12},{17,8,5,10,19},{10,8,3,-5,11},{11,8,3,-1,15},{19,8,6,13,23}};
        int resultado;
        
        if (test==1){
            resultado = lider(tabela2);
            System.out.printf("O time lider do campeonato eh o time %d \n",resultado);
        }else{
        
            System.out.println("Digite o numero de times: ");
            int tamanho = in.nextInt();
            int [][] tabela = new int [tamanho][5];
            int lider,atual;

            //Povoa a matriz com os pontos, gols marcados e etc 
            for (int i=0;i<tabela.length;i++){
                for (int j=0;j<tabela[i].length;j++){
                    switch(j){
                        case 0:
                            System.out.printf("Digite o numero de pontos do time %d: ",i);
                            tabela[i][j] = in.nextInt();
                            break;
                        case 1:
                            System.out.printf("Digite o numero de Jogos do time %d: ",i);
                            tabela[i][j] = in.nextInt();
                            break;
                        case 2:
                            System.out.printf("Digite o numero de vitoriasdo do time %d: ",i);
                            tabela[i][j] = in.nextInt();
                            break;
                        case 3:
                            System.out.printf("Digite o numero do saldo de gols do time %d: ",i);
                            tabela[i][j] = in.nextInt();
                            break;
                        case 4:
                            System.out.printf("Digite o numero de gols proprios do time %d: ",i);
                            tabela[i][j] = in.nextInt();
                            break;
                    }
                }
            }
            
            resultado = lider(tabela);
            System.out.printf("O time lider do campeonato eh o time %d \n",resultado);
        }

        
    }
}