package uff.ic.lleme.tcc00328.s20201.exercicios.exercicio12;



public class RenanCabritaValladao {
    public static int n;
    
    public static void main(String[] args){
        n = 2;
        div(n);
    }
    
    public static void div(int n){
        if (n<=0){
            System.out.println("Valor inválido!");
        }
        else{
            System.out.println("Divisores de " + n + ":");
            for(int i=1; i<=n/2; i++){
                if(n%i==0) System.out.println(i);
            }
            System.out.println(n);
        }
    }
}
