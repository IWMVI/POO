package view;

import model.Produto;

public class Principal {
    public static void main(String[] args) throws IllegalArgumentException{
        Produto produto1 = new Produto("Camiseta", 29.90f, 50);
        Produto produto2 = new Produto("Calça Jeans", 89.90f, 30);

        System.out.println("Produto 'Camiseta' disponível? " + produto1.verificarProdutoDisponivel("Camiseta"));
        System.out.println("Produto 'Calça Jeans' disponível? " + produto2.verificarProdutoDisponivel("Calça Jeans"));

        System.out.println("Valor total em estoque de 'Camiseta': R$" + produto1.totalValorEstoque());
        System.out.println("Valor total em estoque de 'Calça Jeans': R$" + produto2.totalValorEstoque());

        produto1.setQtdEstoque(40);
        System.out.println("Novo valor total em estoque de 'Camiseta': R$" + produto1.totalValorEstoque());
    }
}
