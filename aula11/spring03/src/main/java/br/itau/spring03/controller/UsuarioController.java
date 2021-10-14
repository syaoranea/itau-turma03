package br.itau.spring03.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.itau.spring03.model.Usuario;
import br.itau.spring03.repository.UsuarioRepo;

@RestController
@CrossOrigin("*")
@RequestMapping("/user")
public class UsuarioController {
    
    @Autowired
    private UsuarioRepo repo;

    @GetMapping("/{codigo}")
    public ResponseEntity<Usuario> buscarUsuario(@PathVariable long codigo) {
        Usuario usuario = repo.findById(codigo).orElse(null);

        if(usuario != null) {
            return ResponseEntity.ok(usuario);
        }
        return ResponseEntity.notFound().build();
    }

}
