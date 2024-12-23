package br.com.alexjr.exercicios_jpa.infra;

import br.com.alexjr.exercicios_jpa.model.basico.Produto;

public class ProdutoDAO extends DAO<Produto> {

    public ProdutoDAO() {
        super(Produto.class);
    }

}
