package view;

import model.Conta;
import model.SaldoInsuficienteException;

public class Main {

    public static void main(String[] args) {

        Conta minhaConta = new Conta();
        try {
            minhaConta.deposita(100);
            minhaConta.saca(50);
            minhaConta.saca(150);
        } catch (SaldoInsuficienteException e) {
            System.err.println(e.getMessage());
        }
    }
}
