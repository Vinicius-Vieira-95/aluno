package com.vnc.expert_jpa.curso;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.vnc.expert_jpa.curso.domain.entities.Aluno;
import com.vnc.expert_jpa.curso.exceptions.AlunoException;
import com.vnc.expert_jpa.curso.infra.repositories.AlunoRepository;

@SpringBootApplication
public class CursoApplication implements CommandLineRunner {
	
	@Autowired
	private AlunoRepository alunoRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(CursoApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		
//		Aluno aluno1 = new Aluno(null, "Joana Silva", 12345L);
//		Aluno aluno2 = new Aluno(null, "João Vitu Silva", 15412L);
//		Aluno aluno3 = new Aluno(null, "Ana Cecilia", 48984L);
//		alunoRepository.saveAll(Arrays.asList(aluno1, aluno2, aluno3));
		findAluno();
	}
	
	private void findAluno() {
		alunoRepository.findAll().forEach(x -> System.out.println(x));
	}
}
