package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Saudacao;

public class SaudacaoTest {
    public static void main(String[] args) {
        Saudacao multiplicar = new Saudacao();
        multiplicar.calculadoraSimples(6,9);
        multiplicar.calculadoraSimples(0,2);
        multiplicar.calculadoraSimples(4,4);
    }
}
