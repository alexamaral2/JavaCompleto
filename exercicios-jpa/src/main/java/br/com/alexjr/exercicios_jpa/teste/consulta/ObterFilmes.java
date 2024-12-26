package br.com.alexjr.exercicios_jpa.teste.consulta;

import br.com.alexjr.exercicios_jpa.infra.DAO;
import br.com.alexjr.exercicios_jpa.model.muitospramuitos.Ator;
import br.com.alexjr.exercicios_jpa.model.muitospramuitos.Filme;

import java.util.List;

public class ObterFilmes {

    public static void main(String[] args) {

        DAO<Filme> dao = new DAO<>(Filme.class);
        List<Filme> filmes = dao.consultar("obterFilmesComNotaMaiorQue", "nota", 8.5);

        System.out.println(filmes.size());
        for (Filme filme : filmes) {
            System.out.println(filme.getNome() + " => " + filme.getNota());

            for(Ator ator : filme.getAtores()){
                System.out.println(ator.getNome());
            }
        }
    }
}
