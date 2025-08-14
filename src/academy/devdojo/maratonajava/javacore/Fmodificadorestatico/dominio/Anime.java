package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.dominio;

public class Anime {
    private  String nome;
    private static int[] episodios ;
    // 0 - Bloco de inicializaçãoN ESTATICO é executado quando a JVM carregar a classe
    // 1 - Alocado espaço em memoria
    // 2 - Cada atributo de classe é criado  e inicializado com valores default ou o que for passado
    // 3 - Bloco de inicialização é executado
    // 4 - Construtor é executado

    //Blocos de inicialização
    static {
        System.out.println("Dentro do bloco de inicialização");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i+1;
        }
    }
    static {
        System.out.println("Dentro do bloco de inicialização 2");
    }
    static {
        System.out.println("Dentro do bloco de inicialização 3");
    }
    {
        System.out.println("Dentro do bloco de inicialização não estatico 3");
    }
    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {

        for (int episodio: Anime.episodios){
            System.out.print(episodio +" ");
        }
        System.out.println( " ");
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
