package br.com.alexjr.exercicios_jpa.teste.consulta;

import br.com.alexjr.exercicios_jpa.infra.DAO;
import br.com.alexjr.exercicios_jpa.model.consulta.NotaFilme;

public class ObterMediaFilmes {

    public static void main(String[] args) {
        DAO<NotaFilme> dao = new DAO<>(NotaFilme.class);
        NotaFilme nota = dao.consultarUm("obterMediaGeralDosFilmes");

        System.out.println(nota.getMedia());

        dao.fechar();
    }
}
