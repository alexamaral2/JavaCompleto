package br.com.alexjr.exercicios_jpa.teste.basico;

import br.com.alexjr.exercicios_jpa.infra.DAO;
import br.com.alexjr.exercicios_jpa.model.basico.Produto;

import java.math.BigDecimal;

public class NovoProduto {
    public static void main(String[] args) {
        Produto produto = new Produto("Monitor 23", new BigDecimal("789.98"));

        DAO<Produto> dao = new DAO<>(Produto.class);
        dao.incluirAtomico(produto).fechar();

        System.out.println("ID do produto: " + produto.getId());
    }
}
