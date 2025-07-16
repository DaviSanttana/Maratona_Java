package academy.devdojo.maratonajava.javacore.Csobrecargametodos.test;

import academy.devdojo.maratonajava.javacore.Csobrecargametodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime  = new Anime();

        //anime.init("One Piece", "Tv", 1110);
        anime.init("One Piece 3 ", "Tv", 1110,"ação");
        //anime.setGenero("AÇÃO");
        anime.imprime();
    }
}
