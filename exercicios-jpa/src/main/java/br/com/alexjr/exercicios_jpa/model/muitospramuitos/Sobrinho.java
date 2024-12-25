package br.com.alexjr.exercicios_jpa.model.muitospramuitos;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Sobrinho {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @ManyToMany(mappedBy = "sobrinhos")
    private List<Tio> tios = new ArrayList<>();

    public Sobrinho() {
    }

    public Sobrinho(String nome) {
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

    public List<Tio> getTios() {
        return tios;
    }

    public void setTios(List<Tio> tios) {
        this.tios = tios;
    }
}
