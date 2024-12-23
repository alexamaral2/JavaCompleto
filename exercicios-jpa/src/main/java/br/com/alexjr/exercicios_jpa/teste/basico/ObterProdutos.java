package br.com.alexjr.exercicios_jpa.teste.basico;

import br.com.alexjr.exercicios_jpa.infra.ProdutoDAO;
import br.com.alexjr.exercicios_jpa.model.basico.Produto;

import java.math.BigDecimal;
import java.util.List;

public class ObterProdutos {

    public static void main(String[] args) {
        ProdutoDAO dao = new ProdutoDAO();
        List<Produto> produtos = dao.obterTodos();

        for (Produto produto : produtos) {
            System.out.println("ID: " + produto.getId() + ", Nome: " + produto.getNome());
        }

        BigDecimal precoTotal = produtos
                .stream()
                .map(Produto::getPreco)
                .reduce(BigDecimal.ZERO, BigDecimal::add);

        System.out.println("O valotr total é R$ " + precoTotal);

        dao.fechar();
    }

}
