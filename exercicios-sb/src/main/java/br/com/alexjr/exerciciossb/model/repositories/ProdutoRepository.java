package br.com.alexjr.exerciciossb.model.repositories;

import org.springframework.data.repository.CrudRepository;

import br.com.alexjr.exerciciossb.model.entities.Produto;

public interface ProdutoRepository extends CrudRepository<Produto, Long> {
}
