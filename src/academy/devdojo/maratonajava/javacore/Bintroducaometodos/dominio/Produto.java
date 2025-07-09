package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

public Produto (String nome, double preco, int quantidade){
    this.nome = nome;
    this.preco = preco;
    this.quantidade = quantidade;

    }

    public void imprimeDados() {
        System.out.println("Produto: "+ nome);
        System.out.println("Preço: R$ "+ preco);
        System.out.println("Quantidade: "+ quantidade);
    }

    public double valorTotalEmEstoque() {
        System.out.println();
        return preco * quantidade;
    }
    public void aplicarDesconto (double percentual){
        preco *= (1 - percentual /100 );
    }
}