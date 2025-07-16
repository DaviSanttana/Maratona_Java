package academy.devdojo.maratonajava.javacore.Dconstrutores.test;


import academy.devdojo.maratonajava.javacore.Dconstrutores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime  = new Anime("One Piece"," TV",1100,"Ação");
        Anime anime2 = new Anime();
        anime2.imprime();
    }
}
