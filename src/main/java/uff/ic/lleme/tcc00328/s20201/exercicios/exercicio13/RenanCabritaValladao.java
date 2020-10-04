package uff.ic.lleme.tcc00328.s20201.exercicios.exercicio13;
import java.util.Scanner;

public class RenanCabritaValladao {
    public static int n;
    
    public static void main(String[] args){
        /*Scanner in = new Scanner(System.in);
        System.out.println("Insira o valor de n:");
        n = in.nextInt();
        */
        n = 5;
        float vet[];
        vet = new float[n];
        le_vetor(n, vet);
        System.out.println("Média = " + calc_media(n, vet));    
    }
    
    public static void le_vetor(int n, float[] vet){
        Scanner in = new Scanner(System.in);
        for (int i=0; i<n; i++){
            System.out.println("Insira o próximo valor:");
            vet[i] = in.nextFloat();
        }
    }
    
    public static float calc_media(int n, float[] vet){
        float media = 0;
        for (int i=0; i<n; i++){
            media += vet[i];
        }
        return (media/n);
    }
}
