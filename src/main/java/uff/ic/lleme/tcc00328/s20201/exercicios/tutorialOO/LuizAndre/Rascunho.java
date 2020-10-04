package uff.ic.lleme.tcc00328.s20201.exercicios.tutorialOO.LuizAndre;

public class Rascunho {

    public static void main(String[] args) {
        double prod = 1;
        for (int n = 1; n <= 50; n++)
            if (isPrime(n))
                prod *= n;
        System.out.println(prod);
        System.out.println(6.1488978258849139E17);
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
