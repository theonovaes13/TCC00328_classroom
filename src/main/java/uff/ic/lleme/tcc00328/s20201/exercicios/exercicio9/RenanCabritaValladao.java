package uff.ic.lleme.tcc00328.s20201.exercicios.exercicio9;

public class RenanCabritaValladao {
    public static int n;
    
    public static void main(String[] args){
        /*
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o índice do termo desejado:");
        n = in.nextInt();
        System.out.println("Resultado: " + nFibonacci(n));
        */
        n = 4;
        System.out.println(n + "-ésimo termo: " + nFibonacci(n));
        n = 5;
        System.out.println(n + "-ésimo termo: " + nFibonacci(n));
    }
    
    public static int nFibonacci(int n){
        int f0 = 0, f1 = 1, s;
        for (int i = 0; i<n; i++){
            s = f1+f0;
            f0 = f1;
            f1 = s;
        }
        return f0;
    }
}

