package PartePratica;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Cliente {
    private String nome;

    private LocalDate dataNascimento;

    private Boolean estudante;

    public Cliente(String nome, LocalDate dataNascimento, Boolean estudante) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.estudante = estudante;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public Boolean getEstudante() {
        return estudante;
    }
}

