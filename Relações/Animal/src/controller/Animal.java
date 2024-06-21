package controller;

public class Animal {
    private String nome;
    private int comprimento;
    private int patas;
    private String cor;
    private String ambiente;
    private float velocidade;

    public Animal(String nome, int comprimento, String cor, String ambiente, float velocidade) {
        this.nome = nome;
        this.comprimento = comprimento;
        this.patas = 4;
        this.cor = cor;
        this.ambiente = ambiente;
        this.velocidade = velocidade;
    }

    public void alteraNome(String nome) {
        this.nome = nome;
    }

    public void alteraComprimento(int comprimento) {
        this.comprimento = comprimento;
    }

    public void alteraPatas(int patas) {
        this.patas = patas;
    }

    public void alteraCor(String cor) {
        this.cor = cor;
    }

    public void alteraAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }

    public void alteraVelocidade(float velocidade) {
        this.velocidade = velocidade;
    }

    public void dados() {
        System.out.println("-------------------------------");
        System.out.println("Animal: " + nome);
        System.out.println("Comprimento: " + comprimento + " cm");
        System.out.println("Patas: " + patas);
        System.out.println("Cor: " + cor);
        System.out.println("Ambiente: " + ambiente);
        System.out.println("Velocidade: " + velocidade + " m/s");
        System.out.println("-------------------------------");
    }
}
