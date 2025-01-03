package br.com.alexjr.exerciciossb.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.com.alexjr.exerciciossb.model.entities.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

	public Iterable<Produto> findByNomeContainingIgnoreCase(String parteNome);

	// findByNomeContaining
	// findByNomeIsContaining
	// findByNomeContains
	//
	// findByNomeStartsWith
	// findByNomeEndsWith
	//
	// findByNomeNotContaining

	@Query("SELECT p FROM Produto p WHERE p.nome LIKE %:nome%")
	public Iterable<Produto> searchByNameLike(@Param("nome") String nome);
}