package uff.ic.lleme.tcc00328.s20201.exercicios.exercicio8;

public class RenanCabritaValladao {
    public static int n;
    
    public static void main(String[] args){
        /*
        Scanner in = new Scanner(System.in);
        System.out.println("Digite um número inteiro:");
        n = in.nextInt();
        */
        n = 7;
        if(primo(n)){
            System.out.println(n + " é primo.");
        }
        else{
            System.out.println(n + " não é primo.");
        }
        n = 9;
        if(primo(n)){
            System.out.println(n + " é primo.");
        }
        else{
            System.out.println(n + " não é primo.");
        }
    }
    
    public static boolean primo(int n){
        if (n==0||n==1){
            return false;
        }
        for(int i = 2; i<=n/2;i++){
            if(n%i==0)
                return false;
        }
        return true;
    }
}
