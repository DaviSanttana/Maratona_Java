package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroExercicio01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.nome = "Lamborghini";
        carro.ano = 2020;
        carro.modelo = "Lmg1" ;

        Carro carro1 = new Carro();
        carro1.nome = "McLaren";
        carro1.ano = 2021;
        carro1.modelo = "Mcl2";

        System.out.println("Nome do carro: "+carro.nome);
        System.out.println("Ano de fabricação: "+carro.ano);
        System.out.println("Modelo lançado: "+carro.modelo);

        System.out.println("========================");

        System.out.println("Nome do carro: "+carro1.nome);
        System.out.println("Ano de fabricação: "+carro1.ano);
        System.out.println("Modelo lançado: "+carro1.modelo);
    }
}
