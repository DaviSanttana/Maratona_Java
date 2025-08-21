package academy.devdojo.maratonajava.javacore.Jmodificadorfinal.test;

import academy.devdojo.maratonajava.javacore.Jmodificadorfinal.dominio.Carro;
import academy.devdojo.maratonajava.javacore.Jmodificadorfinal.dominio.Comprador;
import academy.devdojo.maratonajava.javacore.Jmodificadorfinal.dominio.Ferrari;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro c1 = new Carro();
        Comprador comprador2 = new Comprador();
        System.out.println(Carro.VELOCIDADE_LIMITE);
        System.out.println(c1.COMPRADOR);
        c1.COMPRADOR.setNome("Hidan");
        System.out.println(c1.COMPRADOR);
        Ferrari ferrari = new Ferrari();
        ferrari.setNome("Ferrari gt-3");
        ferrari.imprime();
    }
}
