package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Selecao {
    private String nomeSelecao;
    private  JogadorBrasil[] jogadoresBrasil;

    public Selecao(String nomeSelecao) {
        this.nomeSelecao = nomeSelecao;
    }

    public Selecao(String nomeSelecao, JogadorBrasil[] jogadoresBrasil) {
        this.nomeSelecao = nomeSelecao;
        this.jogadoresBrasil = jogadoresBrasil;
    }

    public void imprime(){
        System.out.println(this.jogadoresBrasil);
        if(jogadoresBrasil == null)return;
        for (JogadorBrasil jogadorBrasil: this.getJogadoresBrasil()){
            System.out.println(jogadorBrasil.getNome());
            System.out.println(jogadorBrasil.getIdade());
            System.out.println(jogadorBrasil.getTime());
        }
    }

    public String getNomeSelecao() {
        return nomeSelecao;
    }

    public void setNomeSelecao(String nomeSelecao) {
        this.nomeSelecao = nomeSelecao;
    }

    public JogadorBrasil[] getJogadoresBrasil() {
        return jogadoresBrasil;
    }

    public void setJogadoresBrasil(JogadorBrasil[] jogadoresBrasil) {
        this.jogadoresBrasil = jogadoresBrasil;
    }
}
