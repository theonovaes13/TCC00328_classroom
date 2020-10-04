package uff.ic.lleme.tcc00328.s20201.exercicios.exercicio16;

import java.util.Scanner;

public class GabrielaPinheiro {
    public static int vencedor(int times[][]){
        int campeao = 0;
        int valor = times[0][0];
        
        for (int i = 1; i < times.length;i++ ){
            if (times[i][0] > valor){
                campeao = i;
                valor = times[i][0];
            }
            if(times[i][0] == valor){ 
                if(times[i][2] > times[campeao][2]){
                    campeao = i;
                }
                if(times[i][2] == times[campeao][2]){
                    if(times[i][3] > times[campeao][3]){
                        campeao = i;
                    }
                    if(times[i][3] == times[campeao][3]){
                        if(times[i][4] > times[campeao][4]){
                            campeao = i;
                        }
                    }
                }
            }
        }
        
        return campeao;   
    }
    public static void main(String[] args) {
        int times[][],num;
        Scanner in = new Scanner(System.in);
        
        System.out.println("Digite o numero de times: ");
        num= in.nextInt();
        times = new int[num][5];

        for(int i=0; i< num; i++){
            for(int j=0; j<5; j++){
                System.out.println("Insira o item "+ j +" do time " + i);
                times[i][j] = in.nextInt();
            }
        }
        System.out.println(vencedor(times));
        
    }
    
}
