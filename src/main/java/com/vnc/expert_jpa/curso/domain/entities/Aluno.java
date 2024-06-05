package com.vnc.expert_jpa.curso.domain.entities;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Aluno {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID id;
	
	@Column(length = 150)
	private String nome;
	
	private Long matricula;

	public Aluno() {
	}

	public Aluno(UUID id, String nome, Long matricula) {
		this.id = id;
		this.nome = nome;
		this.matricula = matricula;
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Long getMatricula() {
		return matricula;
	}

	public void setMatricula(Long matricula) {
		this.matricula = matricula;
	}

	@Override
	public String toString() {
		return "Aluno : id = " + id + ", nome= " + nome + ", matricula= " + matricula + "";
	}
	
}
