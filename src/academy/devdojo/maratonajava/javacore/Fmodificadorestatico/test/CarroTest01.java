package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.test;

import academy.devdojo.maratonajava.javacore.Fmodificadorestatico.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro c1 = new Carro("Lamborghini0", 312);
        Carro c2 = new Carro("Bugatti", 330);
        Carro c3 = new Carro("Mclaren", 320);
        Carro.setVelocidadeLimite(180);
        c1.imprime();
        c2.imprime();
        c3.imprime();

    }
}
