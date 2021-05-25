package com.teste.JUnit2.repository;

	import org.springframework.data.jpa.repository.JpaRepository;
	import com.teste.JUnit2.model.ContatoModel;

	public interface ContatoRepository extends JpaRepository<ContatoModel, Long> {

	}
