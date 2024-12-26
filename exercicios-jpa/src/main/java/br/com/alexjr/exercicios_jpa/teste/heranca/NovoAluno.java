package br.com.alexjr.exercicios_jpa.teste.heranca;

import br.com.alexjr.exercicios_jpa.infra.DAO;
import br.com.alexjr.exercicios_jpa.model.heranca.Aluno;
import br.com.alexjr.exercicios_jpa.model.heranca.AlunoBolsista;

public class NovoAluno {

    public static void main(String[] args) {
        DAO<Aluno> alunoDAO = new DAO<>();

        Aluno aluno1 = new Aluno(123L, "João");
        AlunoBolsista aluno2 = new AlunoBolsista(345L, "Maria", 1000.0);

        alunoDAO.incluirAtomico(aluno1);
        alunoDAO.incluirAtomico(aluno2);

        alunoDAO.fechar();

    }
}
