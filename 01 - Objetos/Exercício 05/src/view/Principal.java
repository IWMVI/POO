package view;

import model.Pessoa;

import java.time.LocalDate;

public class Principal {
    public static void main(String[] args) {
        LocalDate dataNascimento = LocalDate.of(2000, 1, 15);
        Pessoa pessoa = new Pessoa("Wallace", dataNascimento, "Engenheiro");

        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Profissão: " + pessoa.getProfissao());
        System.out.println("Data de Nascimento: " + pessoa.getDataNascimento());
        System.out.println("Idade: " + pessoa.getIdade() + " anos");

        if (pessoa.verificarIdade()) {
            System.out.println("Idade válida.");
        } else {
            System.out.println("Idade inválida.");
        }
    }
}
