package model;

import java.time.LocalDate;
import java.time.Period;

public class Pessoa {

    private String nome;
    private LocalDate dataNascimento;
    private String profissao;
    private static final int IDADE_MAXIMA = 150;

    public Pessoa(String nome, LocalDate dataNascimento, String profissao) {
        this.nome = nome;
        this.profissao = profissao;
        setDataNascimento(dataNascimento);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
        if (!verificarIdade()) {
            throw new IllegalArgumentException("Idade inválida.");
        }
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public int getIdade() {
        if (dataNascimento == null) {
            throw new IllegalStateException("Data de nascimento não definida.");
        }
        LocalDate hoje = LocalDate.now();
        Period periodo = Period.between(this.dataNascimento, hoje);
        return periodo.getYears();
    }

    public boolean verificarIdade() {
        if (dataNascimento == null) {
            return false;
        }
        int idade = getIdade();
        return idade >= 0 && idade <= IDADE_MAXIMA;
    }
}
