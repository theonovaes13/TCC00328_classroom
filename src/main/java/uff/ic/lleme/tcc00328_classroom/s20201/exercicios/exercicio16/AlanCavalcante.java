/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uff.ic.lleme.tcc00328_classroom.s20201.exercicios.exercicio16;
import java.util.Scanner;
/**
 *
 * @author alanl
 */
public class AlanCavalcante {
    public static void main(String[] args){
        
        int qtd, campeao_nome;
        Scanner in = new Scanner (System.in);
        System.out.println("Digite a quantidade de times do campeonato: ");
        qtd = in.nextInt();
        int[][] matriz = new int [qtd][5];
        int[] ganhador = new int [5];
        for(int i=0; i< qtd; i++){
            
            System.out.println("Digite o número de Pontos Ganhos, Jogos, Quantidade de Vitorias, Saldo de Gols, Gos Proprios do time seprados por espaço");
            matriz[i][0] = in.nextInt();
            matriz[i][1] = in.nextInt();
            matriz[i][2] = in.nextInt();
            matriz[i][3] = in.nextInt();
            matriz[i][4] = in.nextInt();
         
        }
        ganhador = matriz[0];
        campeao_nome = 0;
        for (int i=0; i< qtd; i++){
            if(i!=0){
                if (matriz[i][0] > ganhador[0]) {
                    ganhador = matriz[i];
                    campeao_nome = i;
                }
                else if(matriz[i][0] == ganhador[0]){
                    if (matriz[i][2] > ganhador[2]){
                        ganhador = matriz[i];
                        campeao_nome = i;

                    }
                    else if (matriz[i][2] == ganhador[2]){
                        if(matriz[i][3] > ganhador[3]){
                            ganhador = matriz[i];
                            campeao_nome = i;

                        }
                        else if (matriz[i][3] == ganhador[3]){
                            if(matriz[i][4] > ganhador[4]){
                                ganhador = matriz[i];
                                campeao_nome = i;
            //10 8 3 -4 12
            //17 8 5 10 19

                            }
                        }
                    }
                }
            }

            System.out.println("Time "+i);
            System.out.println("Pontos: "+matriz[i][0]+", Jogos: "+matriz[i][1]+", Vitorias: "+matriz[i][2] + ", Saldo: "+matriz[i][3]+", Gp: "+matriz[i][4]);
            
        }
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("O Campeao foi o time "+campeao_nome);
        //System.out.println("Partidas: "+matriz[0][0]+" Jogos "+matriz[0][1]+" Vitorias "+matriz[0][2] + " Saldo "+matriz[0][3]+" Gp "+matriz[0][4]);
    }
    
}
