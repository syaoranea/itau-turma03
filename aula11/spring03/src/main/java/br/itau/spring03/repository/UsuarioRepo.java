package br.itau.spring03.repository;

import org.springframework.data.repository.CrudRepository;

import br.itau.spring03.model.Usuario;

public interface UsuarioRepo extends CrudRepository<Usuario, Long> {
    
}