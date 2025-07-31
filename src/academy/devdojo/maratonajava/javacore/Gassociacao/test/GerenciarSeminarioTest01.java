package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Estudantes;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Local;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Professores;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Seminario;

public class GerenciarSeminarioTest01 {
    public static void main(String[] args) {
        Local local = new Local("Rua dos Tupis, 1412");
        Estudantes alunos = new Estudantes("Davi",17);
        Professores professores = new Professores("William","Matematica");
        Estudantes[] estudantesParaSeminario = {alunos};

        Seminario seminario = new Seminario("Onde achar o one piece",estudantesParaSeminario,local);

        Seminario[] seminariosDisponiveis = {seminario};

        professores.setSeminario(seminariosDisponiveis);
        professores.impime();
    }
}
