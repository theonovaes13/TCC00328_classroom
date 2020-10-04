package uff.ic.lleme.tcc00328.s20201.exercicios.exercicio11;

public class GyselleMello {
    public static int primo(int n) {
        int  x = 1, div = 0;
        do {
            if(n%x == 0) {
                div++;
            }
            x++;
        }while(x<=n);
        if(div == 2) {
            return n;
        }else{
            return 1; 
        }
    }
    public static void main(String[] args) {
       long resultado = 1;
       for(int i = 1; i<=50; i++) {
           resultado *= primo(i);
       }
       System.out.println("O produto dos inteiros primos de 1 a 50 é: " + resultado);
    }
}
