package uff.ic.lleme.tcc00328_classroom.s20201.exercicios.exercicio7;

public class RenanCabritaValladao {
    public static int x, y;
    
    public static void main(String[] args){
        /*Scanner in = new Scanner(System.in);
        System.out.println("Digite um valor para x:");
        x = in.nextInt();
        System.out.println("Digite um valor para y:");
        y = in.nextInt();
        */
        x = 42; 
        y = 24;
        System.out.println("MDC de " + x + " e " + y + ": " + mdc(x, y));
        x = 42; 
        y = 23;
        System.out.println("MDC de " + x + " e " + y + ": " + mdc(x, y));
    }
    
    public static int mdc(int x, int y){
        for(int r = x%y; r!=0;r=x%y){
            x=y;
            y=r;
        }      
        return y;
    }
}
