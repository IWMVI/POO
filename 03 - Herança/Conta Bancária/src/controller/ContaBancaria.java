package controller;

public class ContaBancaria {
    private String cliente;
    private int num_conta;
    protected float saldo;

    public ContaBancaria(String cliente, int num_conta) {
        this.cliente = cliente;
        this.num_conta = num_conta;
        this.saldo = 0;
    }

    public void sacar(float valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public void depositar(float valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }

    public void mostrarDados() {
        System.out.println("Cliente: " + cliente);
        System.out.println("Número da conta: " + num_conta);
        System.out.println("Saldo atual: R$ " + saldo);
    }
}
