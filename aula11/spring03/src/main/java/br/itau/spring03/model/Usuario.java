package br.itau.spring03.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

// shift + ALT + O - organizar os import's

@Entity
@Table(name = "tb_usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod")
    private long codigo;

    @Column(name = "nome", length = 200, nullable = false) // nullable = false --> campo  obrigatório
    private String nome;

    @Column(name = "email", length = 100, nullable = false, unique = true) // unique = true --> não pode cadastrar dois valores iguais
    private String email;

    @Column(name = "senha", length = 30)
    private String senha;

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
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

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    

}
