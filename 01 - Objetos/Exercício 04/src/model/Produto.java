package model;

public class Produto {
    private String nome;
    private float preco;
    private int qtdEstoque;

    public Produto(String nome, float preco, int qtdEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.qtdEstoque = qtdEstoque;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public int getQtdEstoque() {
        return qtdEstoque;
    }

    public void setQtdEstoque(int qtdEstoque) throws IllegalArgumentException{
        if (qtdEstoque >= 0) {
            this.qtdEstoque = qtdEstoque;
        } else {
            throw new IllegalArgumentException("Não é possível ter quantidades negativas no estoque.");
        }
    }

    public boolean verificarProdutoDisponivel(String nome) {
        return this.nome.equalsIgnoreCase(nome) && this.qtdEstoque > 0;
    }

    public float totalValorEstoque() {
        return this.preco * this.qtdEstoque;
    }
}
