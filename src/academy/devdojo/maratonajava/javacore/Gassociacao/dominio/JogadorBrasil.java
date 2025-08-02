package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class JogadorBrasil {
    private String nome;
    private int idade;
    private String time;

    public JogadorBrasil(String nome, int idade, String time) {
        this.nome = nome;
        this.idade = idade;
        this.time = time;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
