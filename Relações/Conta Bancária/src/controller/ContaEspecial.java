package controller;

public class ContaEspecial extends ContaBancaria {
    private float limite;

    public ContaEspecial(String cliente, int num_conta, float limite) {
        super(cliente, num_conta);
        this.limite = limite;
    }

    @Override
    public void sacar(float valor) {
        if (valor > 0 && (saldo - valor) >= -limite) {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente ou valor acima do limite.");
        }
    }
}
