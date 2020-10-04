package uff.ic.lleme.tcc00328.s20201.exercicios.tutorialOO;

public abstract class Pessoa {

    public String nome = null;
    public long cpf;

    public void validarDV(long cpf) throws NumberFormatException {
        boolean eValido = false;
        //cpf
        if (!eValido)
            throw new NumberFormatException();
    }
}
