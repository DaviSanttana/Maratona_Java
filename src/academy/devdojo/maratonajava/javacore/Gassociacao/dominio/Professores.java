package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Professores {
    private String nome;
    private String especialidade;
    private Seminario[] seminario;


    public Professores(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public Professores(String nome, String especialidade, Seminario[] seminario) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.seminario = seminario;
    }

    public void impime() {
        System.out.println("---------------------------------");
        System.out.println("Professor: " + this.nome);
        if (this.seminario == null) return;
        System.out.println("##Seminario Cadastrados: ##");
        for (Seminario seminario : this.seminario) {
            System.out.println(seminario.getTitulo());
            System.out.println(seminario.getLocal().getEndereco());
            if (seminario.getEstudantes() == null || seminario.getEstudantes().length == 0  ) continue;
            System.out.println("** Alunos **");
            for (Estudantes estudante : seminario.getEstudantes()) {

                System.out.println("Aluno :" + estudante.getNome() + " idade: " + estudante.getIdade());

            }
        }
    }
            public String getNome () {
                return nome;
            }

            public void setNome (String nome){
                this.nome = nome;
            }

            public String getEspecialidade () {
                return especialidade;
            }

            public void setEspecialidade (String especialidade){
                this.especialidade = especialidade;
            }

            public Seminario[] getSeminario () {
                return seminario;
            }

            public void setSeminario (Seminario[]seminario){
                this.seminario = seminario;
            }
        }