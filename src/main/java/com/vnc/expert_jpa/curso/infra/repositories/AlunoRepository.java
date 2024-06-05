package com.vnc.expert_jpa.curso.infra.repositories;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vnc.expert_jpa.curso.domain.entities.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, UUID>{

	Optional<Aluno>findByNome(String nome);
}
