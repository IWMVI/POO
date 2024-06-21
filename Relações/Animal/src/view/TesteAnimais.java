package view;

import controller.Animal;
import controller.Mamifero;
import controller.Peixe;

public class TesteAnimais {

    public static void main(String[] args) {
        Animal camelo = new Animal("Camelo", 150, "Amarelo", "Terra", 2.0f);
        Peixe tubarao = new Peixe("Tubarão", 300, "Cinzento", 1.5f, "Barbatanas e cauda");
        Mamifero urso = new Mamifero("Urso-do-Canadá", 180, "Vermelho", 0.5f, "Mel");

        System.out.println("Zoo:");
        System.out.println("-------------------------------");
        camelo.dados();
        tubarao.dados();
        urso.dados();
    }
}
