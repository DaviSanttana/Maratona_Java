package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Livro {
    private String titulo;
    private String autor;
    private  int anoDePublicacao;

    public Livro(String titulo, String autor, int anoDePublicacao){
        this.titulo = titulo;
        this.autor = autor;
        this.anoDePublicacao = anoDePublicacao;
    }

    public void imprimeDados(){
        System.out.println("Titulo do livro: "+titulo);
        System.out.println("Autor: "+autor);
        System.out.println("Ano de publicação: "+anoDePublicacao);
    }
}
