package view;

import java.util.Scanner;

import model.Circulo;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circulo c = new Circulo();

        System.out.print("Informe o valor do raio: ");
        double raio = sc.nextDouble();

        c.setRaio(raio);
        System.out.printf("Área do círculo: %.2f", c.getArea());
        sc.close();
    }
}
