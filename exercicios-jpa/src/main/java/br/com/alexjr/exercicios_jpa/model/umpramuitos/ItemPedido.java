package br.com.alexjr.exercicios_jpa.model.umpramuitos;

import br.com.alexjr.exercicios_jpa.model.basico.Produto;
import jakarta.persistence.*;

import java.io.Serializable;
import java.math.BigDecimal;

@Entity
public class ItemPedido implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Pedido pedido;

    @ManyToOne(fetch = FetchType.EAGER)
    private Produto produto;

    @Column(nullable = false)
    private Integer quantidade;

    @Column(nullable = false)
    private BigDecimal preco;

    public ItemPedido() {
    }

    public ItemPedido(Pedido pedido, Produto produto, Integer quantidade) {
        this.setPedido(pedido);
        this.setProduto(produto);
        this.setQuantidade(quantidade);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;

        if(produto != null && this.preco == null) {
            BigDecimal precoProduto = produto.getPreco();
            if (precoProduto != null) {
                this.setPreco(precoProduto);
            }
        }
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }
}
