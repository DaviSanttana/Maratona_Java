package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest03 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen 8 600gt", 12000);

        System.out.println("=================");
        Tomate tomate = new Tomate("Tomate da terra",6);
        tomate.setDataValidade("20/09/2025");

        CalculadoraImposto.CalculadoraImposto(tomate);
        CalculadoraImposto.CalculadoraImposto(produto);

    }
}
