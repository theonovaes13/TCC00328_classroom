package uff.ic.lleme.tcc00328_classroom.s20201.exercicios.exercicio1;

public class LuizAndre {

    public static void main(String[] args) {
        int x = 5;
        int n = 1;
        x = 5 + n++;
        System.out.println(x);
        n = 1;
        x = 5 + ++n;
        System.out.println(x);
    }
}
