package controller;

public class Mamifero extends Animal {
    private String alimento;

    public Mamifero(String nome, int comprimento, String cor, float velocidade, String alimento) {
        super(nome, comprimento, cor, "Terra", velocidade);
        this.alimento = alimento;
    }

    public void alteraAlimento(String alimento) {
        this.alimento = alimento;
    }

    public String alimento() {
        return alimento;
    }

    @Override
    public void dados() {
        super.dados();
        System.out.println("Alimento: " + alimento);
        System.out.println("-------------------------------");
    }
}
