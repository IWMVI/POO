package view;

import controller.ContaEspecial;
import controller.ContaPoupanca;

public class Contas {

    public static void main(String[] args) {
        ContaPoupanca contaPoupanca = new ContaPoupanca("João", 12345, 15);
        ContaEspecial contaEspecial = new ContaEspecial("Maria", 67890, 1000);

        contaPoupanca.depositar(1000);
        contaEspecial.depositar(500);

        contaPoupanca.sacar(200);
        contaEspecial.sacar(1500);
        contaEspecial.sacar(800);

        System.out.println("Dados das Contas:");
        System.out.println("-------------------------------");
        contaPoupanca.mostrarDados();
        System.out.println("-------------------------------");
        contaEspecial.mostrarDados();

        contaPoupanca.calcularNovoSaldo(0.5f);
    }
}
