package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("Samsung g7",11000);
        Tomate tomate = new Tomate("Tomate anão",10);

        CalculadoraImposto.CalculadoraImpostoComputador(computador);
        CalculadoraImposto.CalculadoraImpostoTomate(tomate);
    }
}
