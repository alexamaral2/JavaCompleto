package br.com.alexjr.exercicios_jpa.model.heranca;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("AB")
public class AlunoBolsista extends Aluno {

    private Double valorBolsa;

    public AlunoBolsista() {
    }

    public AlunoBolsista(Long matricula, String nome, Double valorBolsa) {
        super(matricula, nome);
        this.valorBolsa = valorBolsa;
    }
}
