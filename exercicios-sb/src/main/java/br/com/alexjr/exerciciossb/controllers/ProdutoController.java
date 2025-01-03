package br.com.alexjr.exerciciossb.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.alexjr.exerciciossb.model.entities.Produto;
import br.com.alexjr.exerciciossb.model.repositories.ProdutoRepository;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {

	@Autowired
	private ProdutoRepository produtoRepository;

	// @PostMapping
	@RequestMapping(method = { RequestMethod.POST, RequestMethod.PUT })
	public @ResponseBody Produto salvarProduto(@Valid Produto produto) {
		produtoRepository.save(produto);
		return produto;
	}

	@GetMapping
	public Iterable<Produto> obterProdutos() {
		return produtoRepository.findAll();
	}
	
	@GetMapping(path = "/nome/{parteNome}")
	public Iterable<Produto> obterProdutosPorNome(@PathVariable String parteNome) {
		// return produtoRepository.findByNomeContainingIgnoreCase(parteNome);
		return produtoRepository.searchByNameLike(parteNome);
	}

	@GetMapping(path = "/pagina/{numeroPagina}/{qtdePagina}")
	public Iterable<Produto> obterProdutosPorPagina(@PathVariable int numeroPagina,
													@PathVariable int qtdePagina) {
		if(qtdePagina >= 5) qtdePagina = 5;
		Pageable page = PageRequest.of(numeroPagina, qtdePagina);
		return produtoRepository.findAll(page);
	}

	@GetMapping(path = "/{id}")
	public Optional<Produto> obterProdutoPorId(@PathVariable Long id) {
		return produtoRepository.findById(id);
	}

//	@PutMapping
//	public Produto alterarProduto(@Valid Produto produto) {
//		produtoRepository.save(produto);
//		return produto;
//	}

	@DeleteMapping(path = "/{id}")
	public void excluirProduto(@PathVariable Long id) {
		produtoRepository.deleteById(id);
	}
}
