package com.matheus.usuario.infrastructure.repository;

import com.matheus.aprendendo_spring.insfrastructure.entity.Telefone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TelefoneRepository extends JpaRepository<Telefone, Long> {
}
