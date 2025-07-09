package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Livro;

public class LivroTest01 {
    public static void main(String[] args) {
        Livro livro = new Livro("You", "Davi", 2021);
        livro.imprimeDados();
    }
}
