package br.com.alexjr.exercicios_jpa.model.umpraum;

import br.com.alexjr.exercicios_jpa.model.basico.Usuario;
import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name= "assentos")
public class Assento implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @OneToOne(mappedBy = "assento")
    private Cliente cliente;

    public Assento() {
    }

    public Assento(String nome) {
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
