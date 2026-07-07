package com.matheus.usuario.infrastructure.repository;

import com.matheus.aprendendo_spring.insfrastructure.entity.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Long> {
}
