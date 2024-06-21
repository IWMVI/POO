package view;

import model.Paralelogramo;
import model.Quadrilatero;
import model.Trapezio;

public class TesteQuadrilateros {

    public static void main(String[] args) {
        Quadrilatero quadrilatero = new Paralelogramo(5, 3);
        Quadrilatero trapezio = new Trapezio(10, 6, 4);

        // Exibindo dados e cálculos
        System.out.println("Paralelogramo:");
        System.out.println("Área: " + quadrilatero.calcArea());
        System.out.println("Perímetro: " + quadrilatero.calcPerimetro());

        System.out.println("\nTrapezio:");
        System.out.println("Área: " + trapezio.calcArea());
        System.out.println("Perímetro: " + trapezio.calcPerimetro());
    }
}
