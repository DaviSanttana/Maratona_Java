package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Televisao;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("Samsung g7",11000);
        Tomate tomate = new Tomate("Tomate anão",10);
        Televisao tv = new Televisao("Samsung 48\"",3000);

        CalculadoraImposto.CalculadoraImposto(computador);
        System.out.println("-----------------------");
        CalculadoraImposto.CalculadoraImposto(tomate);
        System.out.println("-----------------------");
        CalculadoraImposto.CalculadoraImposto(tv);

    }
}
