package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.repositorio.Repositorio;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.RepositorioArquivo;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.RepositorioBancoDeDados;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.RepositorioMemoria;

import java.util.ArrayList;
import java.util.List;

public class RepositorioTeste {
    public static void main(String[] args) {
        List<String>list = new ArrayList<>();
        Repositorio repositorio  = new RepositorioBancoDeDados();
        Repositorio repositorio2  = new RepositorioArquivo();
        Repositorio repositorio3  = new RepositorioMemoria();
        repositorio.salvar();
        repositorio2.salvar();
        repositorio3.salvar();
        list.add("Davi");
        list.add("Gabriel");
        list.add("Santana");
        System.out.println(list);
    }
}
