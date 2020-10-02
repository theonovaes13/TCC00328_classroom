package uff.ic.lleme.tcc00328_classroom.aulas;

public class Matricular {

    public static void main(String[] args) {
        Aluno gabriel = new Aluno("Gabriel");
        Aluno aluno2 = new Aluno();

        //gabriel.nome = "Gabriel";
        aluno2.nome = "Lucca";
        Aluno.depto = "IC/UFF";

        System.out.println(gabriel.nome);
        System.out.println(aluno2.nome);
        System.out.println(aluno2.depto);

        Disciplina poo = new Disciplina();
        poo.codigo = "TCC00328";
        poo.nome = "Progranacao Orientada a Objetos";
        poo.sigla = "POO";

        Util.validarDVCpf(0);

        Inscricao inscricaoGabriel = new Inscricao();
        inscricaoGabriel.aluno = gabriel;
        inscricaoGabriel.disciplina = poo;

        gabriel.inscricoes[0] = inscricaoGabriel;

        for (int i = 0; i < gabriel.inscricoes.length; i++)
            if (gabriel.inscricoes[i] != null)
                System.out.println(gabriel.inscricoes[i].disciplina.nome);

        for (Inscricao insc : gabriel.inscricoes)
            if (insc != null)
                System.out.println(insc.disciplina.nome);

    }
}
