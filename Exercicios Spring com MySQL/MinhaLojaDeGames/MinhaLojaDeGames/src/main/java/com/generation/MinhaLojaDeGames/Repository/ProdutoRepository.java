package com.generation.MinhaLojaDeGames.Repository;

	
	import java.util.List;
	import org.springframework.data.jpa.repository.JpaRepository;
	import com.generation.MinhaLojaDeGames.model.Produto;

	public interface ProdutoRepository extends JpaRepository<Produto, Long> {

		public List<Produto> findAllByDescricaoContainingIgnoreCase(String descricao);
		
	}