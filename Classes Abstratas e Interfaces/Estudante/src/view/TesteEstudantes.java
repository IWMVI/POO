package view;

import model.Estudante;
import model.EstudanteSuperior;
import model.EstudanteTecnico;

public class TesteEstudantes {

    public static void main(String[] args) {
        Estudante alunoTecnico = new EstudanteTecnico("12345", "João", "joao@email.com", 7.5f, 9);
        Estudante alunoSuperior = new EstudanteSuperior("67890", "Maria", "maria@email.com", 8.0f, 12, "Escola XYZ", 2018);

        System.out.println("Aluno Técnico:");
        System.out.println("Percentual de Rendimento: " + alunoTecnico.percentualRendimento());
        System.out.println("Percentual de Progressão: " + alunoTecnico.percentualProgressao());

        System.out.println("\nAluno Superior:");
        System.out.println("Percentual de Rendimento: " + alunoSuperior.percentualRendimento());
        System.out.println("Percentual de Progressão: " + alunoSuperior.percentualProgressao());
    }
}
