package uff.ic.lleme.tcc00328.s20201.exercicios.exercicio13;
import java.util.Scanner;

public class GyselleMello {
    public static void main(String[] args) {
        int n, i;
        float valor, media = 0;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Informe o número de valores que serão fornecidos:");
        n = entrada.nextInt();
        
        for(i=1;i<=n;i++) {
            System.out.println("Digite um valor real:");
            valor = entrada.nextFloat();
            media += valor;
        }
        
        media = media/n;
        System.out.println("A média dos valor é: " + media);
    }
}
