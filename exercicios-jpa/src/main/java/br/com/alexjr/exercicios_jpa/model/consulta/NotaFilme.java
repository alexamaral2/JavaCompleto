package br.com.alexjr.exercicios_jpa.model.consulta;

public class NotaFilme {

    private Double media;

    public NotaFilme(Double media) {
        this.media = media;
    }

    public Double getMedia() {
        return media;
    }

    public void setMedia(Double media) {
        this.media = media;
    }
}
