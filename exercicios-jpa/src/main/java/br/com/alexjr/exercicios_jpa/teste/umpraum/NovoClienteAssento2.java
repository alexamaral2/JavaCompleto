package br.com.alexjr.exercicios_jpa.teste.umpraum;

import br.com.alexjr.exercicios_jpa.infra.DAO;
import br.com.alexjr.exercicios_jpa.model.umpraum.Assento;
import br.com.alexjr.exercicios_jpa.model.umpraum.Cliente;

public class NovoClienteAssento2 {

    public static void main(String[] args) {

        Assento assento = new Assento("4D");
        Cliente cliente = new Cliente("Maria", assento);

        DAO<Cliente> clienteDAO = new DAO<>(Cliente.class);
        clienteDAO.incluirAtomico(cliente);
    }
}
