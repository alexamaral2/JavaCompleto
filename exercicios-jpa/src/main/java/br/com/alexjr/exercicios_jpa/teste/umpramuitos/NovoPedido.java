package br.com.alexjr.exercicios_jpa.teste.umpramuitos;

import br.com.alexjr.exercicios_jpa.infra.DAO;
import br.com.alexjr.exercicios_jpa.model.basico.Produto;
import br.com.alexjr.exercicios_jpa.model.umpramuitos.ItemPedido;
import br.com.alexjr.exercicios_jpa.model.umpramuitos.Pedido;

import java.math.BigDecimal;

public class NovoPedido {
    public static void main(String[] args) {
        DAO<Object> dao = new DAO<>();

        Pedido pedido = new Pedido();
        Produto produto = new Produto("Geladeira", new BigDecimal("2789.99"));
        ItemPedido itemPedido = new ItemPedido(pedido, produto, 10);

        dao.abrirT()
                .incluir(produto)
                .incluir(pedido)
                .incluir(itemPedido)
                .fecharT()
                .fechar();
    }
}
