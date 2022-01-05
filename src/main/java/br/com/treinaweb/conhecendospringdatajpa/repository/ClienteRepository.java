package br.com.treinaweb.conhecendospringdatajpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.treinaweb.conhecendospringdatajpa.entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}