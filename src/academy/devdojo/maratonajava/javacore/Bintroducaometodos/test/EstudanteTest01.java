package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante =new Estudante();
        Estudante estudante1 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante.nome = "Davi";
        estudante.idade = 20;
        estudante.sexo = 'M';

        estudante1.nome = "Fernanda";
        estudante1.idade = 21;
        estudante1.sexo = 'F';

        impressora.imprime(estudante);

        impressora.imprime(estudante1);


    }
}
