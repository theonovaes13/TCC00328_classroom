package uff.ic.lleme.tcc00328_classroom.s20201.exercicios;

public class Rascunho {

    public static void main(String[] args) {
        System.out.println("1 e primo: " + isPrime(1));
        System.out.println("2 e primo: " + isPrime(2));
        System.out.println("221 e primo: " + isPrime(221));
        System.out.println("227 e primo: " + isPrime(227));
        System.out.println("229 e primo: " + isPrime(229));
    }

    public static boolean isPrime(int n) {
        if (n > 1) {
            for (int div = 2; n > 2 && div < Math.sqrt(n) + 1; div++)
                if (n % div == 0)
                    return false;
            return true;
        } else
            return false;
    }
}
