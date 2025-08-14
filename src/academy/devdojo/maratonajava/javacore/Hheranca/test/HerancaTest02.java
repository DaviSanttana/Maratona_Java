package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;

public class HerancaTest02 {
    // 0 - Bloco de inicialização ESTATICO da super classe é executado quando a JVM carregar a classe pai
    // 1 - Bloco de inicialização ESTATICO da sub classe é executado quando a JVM carregar a classe filha
    // 2 - Alocado espaço em memoria pro objeto da clsse superclasse
    // 3 - Cada atributo de superclasse é criado e inicializado com valores default( padrões ) ou o que for passado
    // 4 - Bloco de inicialização da superclasse é executado na ordem é que aparece
    // 5 - Construtor é executado superclasse

    // 6 - Alocado espaço em memoria pro objeto da subclsse
    // 7 - Cada atributo de subclasse é criado e inicializado com valores default( padrões ) ou o que for passado
    // 8 - Bloco de inicialização da subclasse é executado na ordem é que aparece
    // 9 - Construtor é executado da subclasse
    public static void main(String[] args) {
        Funcionario funcionario =  new Funcionario("KAKASHI");
    }
}
