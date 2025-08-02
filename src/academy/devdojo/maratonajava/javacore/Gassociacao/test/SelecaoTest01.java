package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.JogadorBrasil;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Selecao;

public class SelecaoTest01 {
    public static void main(String[] args) {
        Selecao selecaoBrasil = new Selecao("Brasil");
        JogadorBrasil jogadoresBrasil1 = new JogadorBrasil("CAFU",22,"Milan");
        JogadorBrasil jogadoresBrasil2 = new JogadorBrasil("Pele",28,"Santos");
        JogadorBrasil jogadoresBrasil3 = new JogadorBrasil("Neymar",29,"Santos");
        JogadorBrasil jogadoresBrasil4 = new JogadorBrasil("R9",22,"Milan");

        JogadorBrasil[] jogadoresBrasil = {jogadoresBrasil1,jogadoresBrasil2,jogadoresBrasil3,jogadoresBrasil4};

        selecaoBrasil.setJogadoresBrasil(jogadoresBrasil);
        selecaoBrasil.imprime();
    }
}
