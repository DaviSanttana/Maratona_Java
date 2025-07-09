package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante =new Estudante();
        Estudante estudante1 = new Estudante();

        estudante.nome = "Davi";
        estudante.idade = 20;
        estudante.sexo = 'M';

        estudante1.nome = "Fernanda";
        estudante1.idade = 21;
        estudante1.sexo = 'F';

        estudante.imprime();
        estudante1.imprime();
    }
}
