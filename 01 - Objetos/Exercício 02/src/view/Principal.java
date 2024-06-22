package view;

import java.util.Scanner;

import model.ContaBancaria;

public class Principal {
    public static void main(String[] args) {
        ContaBancaria cb = new ContaBancaria();
        cb.setNome("Wallace");
        cb.setNumeroConta(1);
        cb.setSaldo(3.000);

        System.out.println("Titular: " + cb.nome + "\nNúmero da conta: " + cb.numeroConta + "\nSaldo: " + cb.saldo);
    }
}
