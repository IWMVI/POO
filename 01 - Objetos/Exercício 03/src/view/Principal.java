package view;
import model.Funcionario;

public class Principal {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Wallace", 2000.0, "Analista");

        double salarioLiquido = funcionario.getSalarioLiquido(300.0, 100.0);

        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Cargo: " + funcionario.getCargo());
        System.out.println("Salário Líquido: R$" + salarioLiquido);
    }
}
