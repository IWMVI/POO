package controller;

public class ContaPoupanca extends ContaBancaria {
    private int diaRendimento;

    public ContaPoupanca(String cliente, int num_conta, int diaRendimento) {
        super(cliente, num_conta);
        this.diaRendimento = diaRendimento;
    }

    public void calcularNovoSaldo(float taxaRendimento) {
        saldo += saldo * (taxaRendimento / 100);
        System.out.println("Novo saldo após rendimento: R$ " + saldo);
    }
}
