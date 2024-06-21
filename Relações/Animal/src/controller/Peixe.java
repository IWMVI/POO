package controller;

public class Peixe extends Animal {
    private String caracteristica;

    public Peixe(String nome, int comprimento, String cor, float velocidade, String caracteristica) {
        super(nome, comprimento, cor, "Mar", velocidade);
        this.caracteristica = caracteristica;
    }

    public void alteraCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
    }

    public String caracteristica() {
        return caracteristica;
    }

    @Override
    public void dados() {
        super.dados();
        System.out.println("Característica: " + caracteristica);
        System.out.println("-------------------------------");
    }
}
