package uff.ic.lleme.tcc00328.s20201.exercicios.exercicio11;

public class RenanCabritaValladao {
    
    public static void main(String[] args){
        System.out.println("Produto dos primos entre 1 e 50: " + produto());

    }
    
    public static boolean primo(int n){
        int i = 2;
        if (n==0||n==1){
            return false;
        }
        while (i<=n/2){
            if(n%i==0){
                return false;
            }
            i++;
        }
        return true;
    }
    
    public static long produto(){
        long prod = 1;
        for(int i=1; i<51; i++){
            if(primo(i)){
                prod *= i;
            }
        }
        return prod;
    }
}