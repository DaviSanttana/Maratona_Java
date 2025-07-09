package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Produto;

public class ProdutoTest01 {
    public static void main(String[] args) {

        Produto p1 = new Produto ("Camiseta", 50.0, 10);
        Produto p2 = new Produto ("Calça", 200.0, 10);

        //Produto 1
        p1.imprimeDados();
        System.out.println("Valor total em estoque: R$" + p1.valorTotalEmEstoque());
        System.out.println();


        //Produto 2 antes do desconto
        p2.imprimeDados();
        System.out.println("Valor Total em Estoque: R$" + p2.valorTotalEmEstoque());
        System.out.println("Aplicando 10% de desconto ... ");
        p2.aplicarDesconto(10);//Aplica desconto
        System.out.println();

        p2.imprimeDados();
        System.out.println("Novo valor total em estoque: R$" + p2.valorTotalEmEstoque());
    }
}
