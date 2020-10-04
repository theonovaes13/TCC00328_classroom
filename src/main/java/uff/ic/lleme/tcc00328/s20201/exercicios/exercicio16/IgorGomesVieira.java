
package uff.ic.lleme.tcc00328.s20201.exercicios.exercicio16;

import java.util.Scanner;

public class IgorGomesVieira {
    
    public static int nTimes;
    public static int resultado;
    public static int  timeCampeao;
    public static int maiorPG;
    
    public static int maiorV;
    
    public static int maiorSG;
    
    public static int maiorGP;
    
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o numero de times: ");
        nTimes = in.nextInt();
        int tabela[][] = new int[nTimes][5];
        int i=0;
        int j=0;
        for(i=0;i<nTimes;i++){
            System.out.println("PG "+"time "+i+": ");
            tabela[i][0] = in.nextInt();
            System.out.println("J "+"time "+i+": ");
            tabela[i][1] = in.nextInt();
            System.out.println("V "+"time "+i+": ");
            tabela[i][2] = in.nextInt();
            System.out.println("SG "+"time "+i+": ");
            tabela[i][3] = in.nextInt();
            System.out.println("GC "+"time "+i+": ");
            tabela[i][4] = in.nextInt();
        }
        int k;
        int x;
        for(k=0;k<nTimes;k++){
            for(x=0;x<5;x++){
                System.out.println(tabela[k][x]);
            }
        }
        
        resultado = quemGanhou(nTimes, tabela);
        System.out.println("Time "+resultado + " Ganhou ");
        
    }
    public static int quemGanhou (int nTimes, int[][] tabela){
        int g;
        int o;
        int PGA;
        maiorPG =0;
        maiorV = 0;
        maiorSG =0;
        maiorGP =0;
        int Te;
        int timesEmpatados[] = new int[nTimes];
        for(Te=0;Te<nTimes;Te++){
            timesEmpatados[Te] = -1;
        }
        
        int maiorPGAux[] = new int[nTimes];
        for(PGA=0;PGA<nTimes;PGA++){
            maiorPGAux[PGA] = -1;
        }
        int VA;
        int maiorVAux[] = new int[5];
        for(VA=0;VA<nTimes;VA++){
            maiorVAux[VA] = -1;
        }
        int SGA;
        int maiorSGAux[] = new int[5];
        for(SGA=0;SGA<nTimes;SGA++){
            maiorSGAux[SGA] = -1;
        }
        int GPA;
        int maiorGPAux[] = new int[5];
        for(GPA=0;GPA<nTimes;GPA++){
            maiorGPAux[GPA] = -1;
        }
        
        
        for(g=0;g<nTimes;g++){
            if(tabela[g][0] >= maiorPG){
                maiorPG = tabela[g][0];
                maiorPGAux[g] = 1;
            }
            if(tabela[g][2] >= maiorV){
                maiorV = tabela[g][2];
                maiorVAux[g] = 1;
            }
            if(tabela[g][3] >= maiorSG){
                maiorSG = tabela[g][3];
                maiorSGAux[g] = 1;
            }
            if(tabela[g][4] >= maiorGP){
                maiorGP = tabela[g][4];
                maiorGPAux[g] = 1;
            }
        }
        int p;
        for(p=0;p<nTimes;p++){
            if(maiorPG == tabela[p][0]){
                timesEmpatados[p] += 20;
            }
            if(maiorV == tabela[p][0]){
                timesEmpatados[p] += 10;
            }
            if(maiorSG == tabela[p][0]){
                timesEmpatados[p] += 5;
            }
            if(maiorGP == tabela[p][0]){
                timesEmpatados[p] += 1;
            }
        }
        int q;
        int maiorPontuacao = -1;
        for(q=0;q<nTimes;q++){
            if(timesEmpatados[q] > maiorPontuacao){
                timeCampeao = q;
            }
        }
        
        
	return timeCampeao;
    }
}
