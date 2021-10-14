package br.itau.spring03.dto;

import br.itau.spring03.model.Usuario;

// DTO = Data Transfer Object = Objeto para transferencia de dados

public class UsuarioDTO {
    private String nome;
    private String email;

    public UsuarioDTO(Usuario user) {
        this.nome = user.getNome();
        this.email = user.getEmail();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    
}
