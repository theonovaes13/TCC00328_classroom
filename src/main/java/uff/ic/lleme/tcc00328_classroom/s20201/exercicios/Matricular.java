package uff.ic.lleme.tcc00328_classroom.s20201.exercicios;

public class Matricular {

    public static void main(String[] args) {
        Aluno gabriel = new Aluno();
        Aluno aluno2 = new Aluno();

        gabriel.nome = "Gabriel";
        aluno2.nome = "Lucca";
        Aluno.depto = "IC/UFF";

        System.out.println(gabriel.nome);
        System.out.println(aluno2.nome);
        System.out.println(aluno2.depto);

        Disciplina poo = new Disciplina();
        poo.codigo = "TCC00328";
        poo.nome = "Progranacao Orientada a Objetos";
        poo.sigla = "POO";

        Util.validarCpf(0);

        Inscricao inscricaoGabriel = new Inscricao();
        inscricaoGabriel.aluno = gabriel;
        inscricaoGabriel.disciplina = poo;

        gabriel.inscricoes[0] = inscricaoGabriel;

    }
}
