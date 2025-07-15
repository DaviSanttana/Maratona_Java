package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Davi");
        funcionario.setIdade(18);
        funcionario.setSalarios(new double[]{2000.32, 1800.90, 2400.03});

        funcionario.imprimeDados();
        funcionario.temBonus();
        System.out.println("Media "+ funcionario.getMedia());
    }
}
