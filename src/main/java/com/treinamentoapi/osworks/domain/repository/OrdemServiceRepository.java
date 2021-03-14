package com.treinamentoapi.osworks.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.treinamentoapi.osworks.domain.model.OrdemServico;

public interface OrdemServiceRepository extends JpaRepository<OrdemServico, Long> {

	
	
}
