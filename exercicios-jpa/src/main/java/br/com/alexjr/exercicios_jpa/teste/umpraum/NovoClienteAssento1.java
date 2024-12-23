package br.com.alexjr.exercicios_jpa.teste.umpraum;

import br.com.alexjr.exercicios_jpa.infra.DAO;
import br.com.alexjr.exercicios_jpa.model.umpraum.Assento;
import br.com.alexjr.exercicios_jpa.model.umpraum.Cliente;

public class NovoClienteAssento1 {

    public static void main(String[] args) {

        Assento assento = new Assento("16A");
        Cliente cliente = new Cliente("Carlos", assento);

        DAO<Object> dao = new DAO<>();

        dao.abrirT()
                .incluir(cliente)
                .incluir(assento)
                .fecharT()
                .fechar();
    }
}
