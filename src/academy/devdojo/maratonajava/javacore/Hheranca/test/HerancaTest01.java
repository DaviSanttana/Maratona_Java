package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Endereco;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 3");
        endereco.setCep("22343-434");
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Luffy");
        pessoa.setCpf("11212122256");
        pessoa.setEndereco(endereco);
        pessoa.imprime();

        Funcionario funcionario=  new Funcionario();
        funcionario.setNome("Zoro");
        funcionario.setCpf("515151");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(3000);
        funcionario.imprime();
    }
}
