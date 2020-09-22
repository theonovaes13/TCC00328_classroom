package uff.ic.lleme.tcc00328_classroom.s20201.exercicios.exercicio10;

public class RenanCabritaValladao {
    public static int n;
    
    public static void main(String[] args){
        /*
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o número de termos desejado:");
        n = in.nextInt();
        System.out.println("Resultado: " + serie(n));
        */
        n = 2;
        System.out.println("Resultado: " + serie(n));
        n = 4;
        System.out.println("Resultado: " + serie(n));
    }
    
    public static double serie(int n){
        double soma = 0;
        for (double i = 0; i<n; i++){
            soma += (Math.pow(-1, i))/((2*i)+1);
        }
        return 4*soma;
    }
}