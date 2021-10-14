package br.itau.spring03.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.itau.spring03.dto.UsuarioDTO;
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

    @PostMapping("/email")
    public ResponseEntity<UsuarioDTO> buscaPorEmail(@RequestBody Usuario usuario) {
        Usuario usuarioEncontrado = repo.findByEmail(usuario.getEmail());

        if(usuarioEncontrado != null) {
            // usuarioEncontrado.setSenha("********");
            UsuarioDTO user = new UsuarioDTO(usuarioEncontrado);
            return ResponseEntity.ok(user);
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping("/login")
    public ResponseEntity<UsuarioDTO> fazerLogin(@RequestBody Usuario usuario) {
        Usuario usuarioEncontrado = repo.findByEmailAndSenha(usuario.getEmail(), usuario.getSenha());

        if(usuarioEncontrado != null) {
            UsuarioDTO user = new UsuarioDTO(usuarioEncontrado);
            return ResponseEntity.ok(user);
        }
        return ResponseEntity.notFound().build();
    }


}
