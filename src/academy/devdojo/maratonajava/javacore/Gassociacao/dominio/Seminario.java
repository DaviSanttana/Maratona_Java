package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Seminario {
    private String titulo;
    private Estudantes[] estudantes;
    private Local local;

    public Seminario(String titulo, Estudantes[] estudantes) {
        this.titulo = titulo;
        this.estudantes = estudantes;
    }
    public Seminario(String titulo, Estudantes[] estudantes, Local local) {
        this.titulo = titulo;
        this.estudantes = estudantes;
        this.local = local;
    }
        public String getTitulo () {
            return titulo;
        }

        public void setTitulo (String titulo){
            this.titulo = titulo;
        }

        public Estudantes[] getEstudantes () {
            return estudantes;
        }

        public void setEstudantes (Estudantes[]estudantes){
            this.estudantes = estudantes;
        }
    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }
}