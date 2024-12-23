package br.com.alexjr.exercicios_jpa.teste.umpramuitos;

import br.com.alexjr.exercicios_jpa.infra.DAO;
import br.com.alexjr.exercicios_jpa.model.umpramuitos.ItemPedido;
import br.com.alexjr.exercicios_jpa.model.umpramuitos.Pedido;

public class ObterPedidos {
    public static void main(String[] args) {

        DAO<Pedido> pedidoDAO = new DAO<>(Pedido.class);

        Pedido pedido = pedidoDAO.obterPorId(1L);
        pedidoDAO.fechar();

        for (ItemPedido item : pedido.getItens()){
            System.out.println(item.getQuantidade());
            System.out.println(item.getProduto().getNome());
        }

    }
}
